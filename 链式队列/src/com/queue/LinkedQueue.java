package com.queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node front; //队首指针
	private Node rear; //队尾指针
	//无参构造函数
	public LinkedQueue() {
		//front=rear=null
		//空队列
		this.front = null;
		this.rear = null;
	}
	//队列是否为空
	public boolean isEmpty() {
		return front==null;
	}
	//队列大小，数据元素个数
	public int getSize() {
		Node p=front; 
		int length=0;
		while(p!=null){
			p=p.getNext();
			++length;
		}
		return length;
	}
	//数据元素e入队
	public void enQueue(T e) {
		//构造数据元素e的新节点
		Node p=new Node(e);
		if(isEmpty()){ //队列为空时
		//新节点就是队首指针，也是队尾指针
		front=rear=p;	
		}else{
		//队列不为空时
		//队尾指针指向新节点
		rear.setNext(p);
		//队尾指针后移
		rear=p;
		}
	}
	//队首元素出队，并返回队首数据元素
	public T deQueue() {
		if(isEmpty()){
			return null;
		}else{
			Node p=front;
			//front指向后一个节点
			front=front.getNext();
			//若队首节点也是队尾结点那么rear置为空
			if(rear==p){
				rear=null;
			}
			return (T)p.getData();
		}
	}
	//返回队首数据元素
	public T getFront() {
		return (T)front.getData();
	}

}
