package com.algorithm;

public class PrimeNumber {

	public static void main(String[] args) {
		int from = 0;
		int to = 1000;
		System.out.println("Prime Numbers from " + from + " to " + to + " are");
		primeNumber(from,to);
	}
	
	public static void primeNumber(int min, int max) {
		if(min < 2) {
			min = 2;
		}
		for(int i = min;i < max;i++) {
			boolean prime = true;
			for(int j = 2;j < i/2;j++) {
				if(i % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print(i + " ");
			}
		}
	}
}
