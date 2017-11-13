package com.stack;

public interface Stack<T> {
	public int getSize();//返回堆栈大小
	public boolean isEmpty();//栈是否为空
	public void push(T e);//数据元素e进栈
	public T pop();//返回栈顶元素   出栈
	public T peek();//取栈顶元素    未出栈
}
