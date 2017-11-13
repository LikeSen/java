package com.list;
//²âÊÔ
public class Test {

	public static void main(String[] args) throws Exception {
		
		
		MyLinkedList list=new MyLinkedList();
		list.insert(0, 1);
		list.insert(1,5);
		list.insert2(2, 8);
		list.add(11);
		list.add(20);
		System.out.println(list.length());
		list.display();
		list.remove(3);
		list.display();
		System.out.println(list.indexOf(20));
		System.out.println(list.get(2));
		list.set(0, 100);
		list.display();
		
	}


}
