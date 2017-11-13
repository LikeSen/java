package com.list;
public interface IList {  
	 public void clear();  //是否清空线性表
	 public boolean isEmpty();  //线性表是否为空
	 public int length();  //线性表的长度
	 
	 public Object get(int i) throws Exception; //获取线性表中第i位置的元素 
	 public boolean set(int index,Object x)throws Exception;  //设置线性表第i位置的元素 
	 public void add(Object x) throws Exception;//向线性表的末尾加入元素
	 public void insert(int i, Object x) throws Exception;//向线性表第i位置插入元素
	 
	 public void remove(int i) throws Exception;  //删除线性表中第i位置的元素
	 public int indexOf(Object x);  //获取线性表中x元素的索引号
	 public void display();  //遍历线性表中的元素
} 

