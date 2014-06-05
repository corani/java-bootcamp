package com.example.javatraining;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] a, int key) {
		return Arrays.binarySearch(a, key);
	}
	
	public static boolean contains(int[] a, int key) {
		Arrays.sort(a);
		int index = Arrays.binarySearch(a, 4);
		return index >= 0;
	}
	
	public static void main(String[] args) {
		int[] sortedArray   = new int[] { 1, 2, 3, 4, 5 };
		int[] unsortedArray = new int[] { 5, 2, 3, 4, 1 };
		
		System.out.println(binarySearch(sortedArray, 4));
		System.out.println(contains(unsortedArray, 4));
	}
}
