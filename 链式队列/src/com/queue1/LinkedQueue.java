package com.queue1;
//带头结点
public class LinkedQueue<T> implements Queue<T> {
	private Node front; //队首指针
	private Node rear; //队尾指针
	private int size; //队列中数据元素个数
	//无参构造函数
	public LinkedQueue() {
		//front=rear,指向空节点
		//空队列
		this.front = new Node<T>();
		this.rear = front;
		size=0;
	}
	//队列是否为空
	public boolean isEmpty() {
		return size==0;
	}
	//队列大小，数据元素个数
	public int getSize() {
		return size;
	}
	//数据元素e入队
	public void enQueue(T e) {
		//构造数据元素e的新节点
		Node p=new Node(e,null);
		//队尾指针指向新节点
		rear.setNext(p);
		//队尾指针后移
		rear=p;
		//队列元素加1
		size++;
	}
	//队首元素出队，并返回队首数据元素
	public T deQueue() {
		if(isEmpty()){
			return null;
		}else{
			Node p=front.getNext();
			//front指向后一个节点
			front.setNext(p.getNext());
			//队列元素个数减1
			size--;
			//若删去队首元素后，队列为空
			if(size<1){
				rear=front;
			}
			return (T)p.getData();
		}
	}
	//返回队首数据元素
	public T getFront() {
		return (T)front.getNext().getData();
	}

}
