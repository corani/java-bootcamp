package com.example.javatraining;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SpyOnSecretTask {

	public static void main(String[] args) {		
		try {
			
			SecretTask obj = new SecretTask();
			Class<?> meta = obj.getClass();

			Method method = meta.getDeclaredMethod("getPassword");
			method.setAccessible(true);
			String password = (String) method.invoke(obj);
			System.out.println(password);

			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
