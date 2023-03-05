package com.datastructurealgorithm;

import java.util.Scanner;

public class InsertionSortAlgorithm {
	public static void insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of strings to be sorted: ");
		int num = input.nextInt();
		String[] array = new String[num];
		System.out.println("Enter the strings: ");
		for (int i = 0; i < num; i++) {
			array[i] = input.next();
		}
		insertionSort(array);
		System.out.println("Sorted strings:");
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
	}
}