package com.example.javatraining;

public abstract class Dog implements Animal {
	@Override
	public String getSound() {
		return "woof";
	}
	
	public abstract String getColor();
}