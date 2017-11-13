package com.tree;

import java.util.LinkedList;

public class LinkedQueue<E> {
	private LinkedList<E> list;

	public LinkedQueue() {
		this.list =new LinkedList<E>();
	}
	public void enqueue(E e){
		list.addLast(e);
	}
	public E dequeue(){
		return list.removeFirst();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int getSize(){
		return list.size();
	}
	
}
