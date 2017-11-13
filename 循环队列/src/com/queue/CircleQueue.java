package com.queue;

public class CircleQueue<T> implements Queue<T> {
	private int front; //队首指针
	private int rear;//队尾指针
	private int size;//数组的大小 element.length
	private Object[] elements; //数据元素数组
	//创建默认大小为10的队列
	public CircleQueue() {
		this(10);
	}
	//创建大小为s的队列
	public CircleQueue(int s) {
		size=s+1;  //浪费一个存储空间已区分队列空和队列满
		front=0;
		rear=0;
		this.elements = new Object[size];
	}
	//队列是否为空
	public boolean isEmpty() {
		return rear==front;
	}
	//返回队列大小
	public int getSize() {
		//加上size防止出现负数
		return (rear-front+size)%size;
	}
	//队列是否已满
	public boolean isFull() {
		//return getSize()==(size-1);
		return (rear+1)%size==front;
	}
	public void enQueue(T e) {
		if(isFull()){
			Object[] a=new Object[elements.length*2];//定义新数组大小为原来数组的两倍
			int i=front; 
			int j=0;
			//将从front开始到rear的前一个存储单元的元素复制到新数组中
			while(i!=rear){
				a[j++]=elements[i];
				i=(i+1)%size;
			}
			//elements引用新数组
			elements=a;
			//设置数组大小
			size=elements.length;
			//设置新的队首指针和队尾指针
			front=0;
			rear=j;
			
		}
		//元素e入队
		elements[rear]=e;
		//队尾指针后移
		rear=(rear+1)%size;
	}
	//队首元素出队
	public T deQueue() {
		if(isEmpty()){
			System.out.println("空队列，无数据元素");
			return null;
		}else{
			
			Object temp= elements[front];
			elements[front]=null;
			front=(front+1)%size;
			return (T)temp;
		}
	}
	//取队首元素
	public T getFront() {
		if(isEmpty()){
			System.out.println("空队列，无数据元素");
			return null;
		}else{
			
			return (T)elements[front];
		}
	}

}
