package com.queue;

public class Test {

	public static void main(String[] args) {
		LinkedQueue<String> aq=new LinkedQueue<String>();
		System.out.println(aq.isEmpty());
		aq.enQueue("你好");
		aq.enQueue("teacher");
		System.out.println(aq.getSize());
		aq.enQueue("student");
		System.out.println(aq.getSize());
		aq.enQueue("大家好");
		System.out.println(aq.getFront());
		System.out.println(aq.getSize());
		aq.deQueue();
		System.out.println(aq.deQueue());
		System.out.println(aq.getSize());
		
		
	}
}
