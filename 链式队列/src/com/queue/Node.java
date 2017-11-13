package com.queue;

public class Node<T> {
	private T data; // 数据域   保存数据元素
	private Node<T> next; //指针域  引用后继结点
	//无参构造
	public Node() {
		
	}
	//有参构造  带有数据域
	public Node(T data) {
		this.data = data;
		
	}
	//有参构造  带有数据域和指针域
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
