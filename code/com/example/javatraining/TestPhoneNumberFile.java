package com.example.javatraining;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestPhoneNumberFile {

	public static void printNumbers(String path) {
		PhoneNumberFile file = null;
		try {
			file = PhoneNumberFile.open(path);
			while (!file.eof()) {
				String line = file.readLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		printNumbers("");
	}
}
