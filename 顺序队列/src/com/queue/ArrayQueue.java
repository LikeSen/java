package com.queue;

public class ArrayQueue<T> implements Queue<T>{
	private Object[] elements;//数据元素数组
	private int size;//队列大小，数据元素个数
	//创建默认大小为10的队列
	public ArrayQueue() {
		this(10);
	}
	//创建大小为s的队列
	public ArrayQueue(int s) {
		elements=new Object[s];
		size = 0;
	}
	//队列是否为空
	public boolean isEmpty() {
		return size==0;
	}
	//返回队列大小
	public int getSize() {
		return size;
	}
    //数据元素e入队
	public void enQueue(T e) {
		if(isFull()){//扩充容量
			Object[] temp=elements;
			this.elements=new Object[temp.length*2];
			for(int i=0;i<temp.length;i++){
				this.elements[i]=temp[i];
			}
		}
			this.elements[size]=e;
			size=size+1;
		}
	//队首元素出队
	public T deQueue() {
		if(isEmpty()){//队列为空
			System.out.println("队列为空，无法返回队首元素");
			return null;
		}
		else{
		Object temp=this.elements[0];
		for(int i=0;i<size-1;i++){
			this.elements[i]=this.elements[i+1];
		}
		size=size-1;
		return (T) temp;
		}
	}
	//返回队首元素
	public T getFront() {
		
		return (T)this.elements[0];
	}
	//队列是否已满
	public boolean isFull() {
		return size==elements.length;
	}

}
