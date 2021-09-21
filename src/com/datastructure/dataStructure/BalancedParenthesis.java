package com.datastructure.dataStructure;

public class BalancedParenthesis {
	Stack stack = new Stack();
	
	public void isBalanced(String expression) {
		
		for(int i = 0;i < expression.length();i++) {
			if(expression.charAt(i) == '(') {
				stack.push(expression.charAt(i));
			} else if(expression.charAt(i) == ')') {
				if(stack.isEmpty()) {
					stack.push('a');
					break;
				}
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println(expression + " is Balanced");
		} else {
			System.out.println(expression + " is not Balanced");
		}
	}
}
