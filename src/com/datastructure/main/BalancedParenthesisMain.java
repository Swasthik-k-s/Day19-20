package com.datastructure.main;

import com.datastructure.dataStructure.BalancedParenthesis;

public class BalancedParenthesisMain {

	public static void main(String[] args) {
		String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		BalancedParenthesis balancedParenthesis = new BalancedParenthesis();
		balancedParenthesis.isBalanced(expression);
	}

}
