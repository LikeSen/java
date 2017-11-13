package com.stack;

public class ArrayStack<T> implements Stack<T> {
	private int top; // 栈顶指针
	private Object[] elements;//数据元素数组
	//有参构造  创建size大小的空栈
	public ArrayStack(int size) {
		this.top = -1;
		this.elements = new Object[size];
	}
	//无参构造  创建默认大小（8）的空栈
	public ArrayStack() {
		this(8);
	}
	//返回堆栈大小
	public int getSize() {
		return top+1;
	}
	//栈是否为空
	public boolean isEmpty() {
		return top==-1;
	}
	//数据元素e进栈
	public void push(T e) {
		//数据元素e为空时，不加入栈
		if(e==null){
			return;
		}
		//当栈满时，扩充一倍的容量
		if(top==elements.length-1){
			Object[] temp=this.elements;
			this.elements=new Object[temp.length*2];
			for(int i=0;i<temp.length;i++){
				this.elements[i]=temp[i];
				}
		}
		//栈顶指针后移
		this.top++;
		//数据元素e进栈
		this.elements[this.top]=e;
	}
	//返回栈顶元素   出栈（即删除栈顶元素）
	public T pop() {
		
		return this.top==-1?null:(T)this.elements[this.top--];
	}
	//取栈顶元素    未出栈（不删除栈顶元素）
	public T peek() {
		return this.top==-1?null:(T)this.elements[this.top];
	}

}
