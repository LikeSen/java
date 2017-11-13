package com.stack;

public class Test {

	public static void main(String[] args) {
		ArrayStack<Integer> stack =new ArrayStack<Integer>(3);
		stack.push(11);
		stack.push(20);
		stack.push(22);
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getSize());
		System.out.println(stack.peek());

	}

}
