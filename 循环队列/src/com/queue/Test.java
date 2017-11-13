package com.queue;

public class Test {

	public static void main(String[] args) {
		CircleQueue<String> aq=new CircleQueue<String>(2);
		System.out.println(aq.isEmpty());
		aq.enQueue("你好");
		aq.enQueue("teacher");
		System.out.println(aq.getSize());
		System.out.println(aq.isFull());
		aq.enQueue("student");
		System.out.println(aq.getSize());
		aq.enQueue("大家好");
		System.out.println(aq.isFull());
		System.out.println(aq.getFront());
		System.out.println(aq.getSize());
		aq.enQueue("person");
		System.out.println(aq.isFull());
		System.out.println(aq.getSize());
		aq.enQueue("people");
		System.out.println(aq.isFull());
		System.out.println(aq.getSize());
		aq.deQueue();
		System.out.println(aq.deQueue());
		System.out.println(aq.getSize());
		
		
	}
}
