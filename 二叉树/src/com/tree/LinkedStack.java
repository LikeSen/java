package com.tree;

import java.util.LinkedList;

public class LinkedStack<E> {
	private LinkedList<E> list;
	public LinkedStack(){
		this.list=new LinkedList<E>();
		
	}
	public void push(E e){
		
		list.addLast(e);
	}
	public E pop(){
		
		return list.removeLast();
	}
	public E peek(){
		return list.getLast();
	}
	public boolean isEmpty(){
		return list.isEmpty();
		
	}
}
