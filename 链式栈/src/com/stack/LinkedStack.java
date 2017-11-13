package com.stack;

public class LinkedStack<T> implements Stack<T> {
	private Node<T> top; //栈顶指针
	private int size;   //栈大小
	//无参构造   空栈
	public LinkedStack() {
		this.top = null;  
		this.size=0;
	}
	//返回堆栈大小
	public int getSize() {
		return size;
	}
	//栈是否为空
	public boolean isEmpty() {
		return this.top==null;
		// return size==0;
	}
	//数据元素e进栈
	public void push(T e) {
		//数据元素为空，不加入栈
		if(e==null){
			return;
		}else{
			//数据元素不为空，数据元素入栈
			//头插入，元素e节点作为新的栈顶节点
			this.top=new Node(e,top);
			//栈大小加1
			size++;
		}
	}
	//返回栈顶元素   出栈
	public T pop() {
		//空栈返回null
		if(this.top==null){
			return null;
		}else{
		//非空栈
		//取栈顶节点的数据元素
		T temp=this.top.getData(); 
		//去除栈顶节点
		this.top=this.top.getNext();
		//栈大小减1
		size--;
		//返回栈顶节点数据元素
		return temp;
	
		}
		
	}
	//取栈顶元素    未出栈
	public T peek() {
		//若栈为空，则返回null，否者返回栈顶节点的数据元素
		return this.top==null?null:this.top.getData();
	}

}
