package com.list;
public interface IList {  
	 public void clear();  //�Ƿ�������Ա�
	 public boolean isEmpty();  //���Ա��Ƿ�Ϊ��
	 public int length();  //���Ա�ĳ���
	 
	 public Object get(int i) throws Exception; //��ȡ���Ա��е�iλ�õ�Ԫ�� 
	 public boolean set(int index,Object x)throws Exception;  //�������Ա��iλ�õ�Ԫ�� 
	 public void add(Object x) throws Exception;//�����Ա��ĩβ����Ԫ��
	 public void insert(int i, Object x) throws Exception;//�����Ա��iλ�ò���Ԫ��
	 
	 public void remove(int i) throws Exception;  //ɾ�����Ա��е�iλ�õ�Ԫ��
	 public int indexOf(Object x);  //��ȡ���Ա���xԪ�ص�������
	 public void display();  //�������Ա��е�Ԫ��
} 

