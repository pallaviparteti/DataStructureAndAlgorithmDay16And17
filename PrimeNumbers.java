package com.datastructurealgorithm;

public class PrimeNumbers {
	public static void main ( String args[]) {
		int range = 1000;
		int num = 2;
		while(num <= range) {
			int i = 2;
			while(i <= num/2) {
				if ( num % i == 0) {
					break;
				}
				i++;
			}
			if(i == (num / 2+1)) {
				System.out.println(num + "");
			} num++;
		}
	}
}
