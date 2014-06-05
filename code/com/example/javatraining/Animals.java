package com.example.javatraining;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class Animals {
	
	public static void printInfo(List<Animal> animals) {
		for (Animal animal : animals) {
			Class<? extends Animal> clazz = animal.getClass();
			
			// Class name
			String name = clazz.getSimpleName();
			if (name.length() == 0) {
				name = "[Anonymous]";
			}
			System.out.print("Type " + name);
			
			// Super classes
			Class<?> superclass = clazz.getSuperclass();
			while (!superclass.getName().equals("java.lang.Object")) {
				System.out.print(" < " + superclass.getSimpleName());
				superclass = superclass.getSuperclass();
			}
			System.out.println();

			// Properties
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				name = method.getName();
				if (name.startsWith("get") && method.getParameterTypes().length == 0) {
					name = name.substring(3);
					try {
						System.out.println("\t" + name + ": " + method.invoke(animal));
					} catch (IllegalAccessException e) {
					} catch (IllegalArgumentException e) {
					} catch (InvocationTargetException e) {
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Retriever());
		animals.add(new Cat());
		animals.add(new Labrador());
		animals.add(new Dog() {
			@Override
			public String getColor() {
				return "invisible";
			}
		});
		printInfo(animals);
	}
}
