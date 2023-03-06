package com.datastructurealgorithm;

public class MergeSortAlgoritham {
	static void mergeTwoHalf(int[] arrayInt, int num) {
		int half_i = 0;
		int i;
		int[] temp = new int[num];
		for (i = 0; i < num - 1; i++) {
			if (arrayInt[i] > arrayInt[i + 1]) {
				half_i = i + 1;
				break;
			}
		}
		if (half_i == 0)
			return;
		i = 0;
		int j = half_i;
		int k = 0;
		while (i < half_i && j < num) {
			if (arrayInt[i] < arrayInt[j])
				temp[k++] = arrayInt[i++];
			else
				temp[k++] = arrayInt[j++];
		}
		while (i < half_i) {
			temp[k++] = arrayInt[i++];
		}
		while (j < num) {
			temp[k++] = arrayInt[j++];{

			}
			for (i = 0; i < num; i++) {
				arrayInt[i] = temp[i];
			}
		}
	}
	public static void main(String[] args) {
		int[] array = { 8, 9, 21, -4, 7, 10 };
		int num = array.length;
		mergeTwoHalf(array, num);
		for (int i = 0; i < num; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}