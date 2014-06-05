package com.example.javatraining;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneNumberFile {
	private int line = 5;
	
	public static PhoneNumberFile open(String path) throws FileNotFoundException {
		return new PhoneNumberFile();
	}
	
	public String readLine() throws IOException {
		if (line-- <= 0) throw new IOException();
		return "12345\tExample";
	}
	
	public boolean eof() throws IOException {
		return line <= 0;
	}
	
	public void close() throws IOException {
		// ...
	}
}