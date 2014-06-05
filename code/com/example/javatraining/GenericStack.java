package com.example.javatraining;

import java.util.LinkedList;

public class GenericStack<T> {
	private LinkedList<T> ll;
	
	public GenericStack() {
		ll = new LinkedList<T>();
	}

	public void push(T item) {
		ll.push(item);
	}
	
	public T peek() {
		return ll.peek();
	}
	
	public T pop() {
		return ll.pop();
	}
	
	public static void main(String[] args) {
		GenericStack<GenericStack<?>> stacks = new GenericStack<>();
		stacks.push(new GenericStack<Integer>());
		stacks.push(new GenericStack<String>());
	}
}
