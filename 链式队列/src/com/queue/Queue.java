package com.queue;

public interface Queue<T> {
	//队列是否为空
	public boolean isEmpty();
	//队列大小，数据元素个数
	public int getSize();
	//数据元素e入队
	public void enQueue(T e);
	//队首元素出队，并返回队首数据元素
	public T deQueue();
	//返回队首数据元素
	public T getFront();
}
