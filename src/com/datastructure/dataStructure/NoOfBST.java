package com.datastructure.dataStructure;

public class NoOfBST {
	
	private int factorial(int num) {
		int fact = 1;
		
		if (num == 0)
			return 1;
		
		return (num * factorial(num - 1));
	}
	
	public void numOfBST(int numOfNode) {
		int catalanNumber = factorial(2 * numOfNode) / (factorial(numOfNode) * factorial(numOfNode + 1));
		System.out.println("Number of binary search tree with " + numOfNode + " node is " + catalanNumber);
	}
}
