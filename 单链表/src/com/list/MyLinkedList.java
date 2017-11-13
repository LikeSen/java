package com.list;

import java.util.Scanner;

//���ڵ�����ֻ��һ��ͷָ�����Ψһ�ı�ʾ�������Ե�������ĳ�Ա����ֻ������һ��ͷָ�뼴�� 
public class MyLinkedList implements IList {
	//�������ͷָ��
	private Node head; 
	 //�޲ι���
	public MyLinkedList() {
		//������ʼ��ͷ���
		head =new Node();
	}
	//�вι���
	public MyLinkedList(int n, boolean Order) throws Exception  
    {  
        this();  
        if (Order)  
        {  
            create1(n);  
        } else  
        {  
            create2(n);  
        }  
    }  
  
    // ��β�巨˳��������������nΪ������Ľ�����  
    public void create1(int n) throws Exception  
    {  
        //���������������  
        Scanner sc = new Scanner(System.in);  
          
        for(int j = 0; j < n; j++)  
        {  
            //�����½�㣬���뵽��β  
            insert(length(), sc.next());  
        }  
    }  
  
    // ��ͷ�巨��λ��������������nΪ������Ľ�����  
    public void create2(int n) throws Exception  
    {  
        /* 
         * ��������������� 
         *  
         * Scanner ʹ�÷ָ���ģʽ��������ֽ�Ϊ��ǣ�Ĭ������¸÷ָ���ģʽ��հ�ƥ�� 
         * Ȼ�����ʹ�ò�ͬ�� next �������õ��ı��ת��Ϊ��ͬ���͵�ֵ�� 
         */  
        Scanner sc = new Scanner(System.in);  
  
        for (int j = 0; j < n; j++)  
        {  
            //�����½�㣬���뵽��ͷ  
            insert(0, sc.next());  
        }  
    }  
	
	public void clear(){
		head.setData(null);
		head.setNext(null);
	}

	public boolean isEmpty() {
		return head.getNext()==null;
	}

	public int length() {
		Node p = head.getNext();  
        
        int lenth = 0;  
          
        while(p != null)  
        {  
            p = p.getNext();  
              
            ++lenth;  
        }  
          
        return lenth;  	
	
	}

	public Object get(int i) throws Exception {
		// ��ʼ����pָ���׽�㣬jΪ������  
        Node p = head.getNext();  
  
        int j = 0;  
  
        // ���׽�㿪ʼ�����ң�ֱ��pָ���i������pΪ��  
        while (p != null && j < i)  
        {  
            // ָ���̽��  
            p = p.getNext();  
  
            // ��������1  
            ++j;  
        }  
  
        // iС��0���ߴ��ڱ���1  
        if (j > i || p == null)  
        {  
            // �׳��쳣  
            throw new Exception("��" + i + "��Ԫ�ز�����");  
        }  
  
        // ���ؽ��p���������ֵ  
        return p.getData();  
	}

	public boolean set(int i, Object x) throws Exception{
		// ��ʼ����pָ���׽�㣬jΪ������  
        Node p = head.getNext();  
  
        int j = 0;  
  
        // ���׽�㿪ʼ�����ң�ֱ��pָ���i������pΪ��  
        while (p != null && j < i)  
        {  
            // ָ���̽��  
            p = p.getNext();  
  
            // ��������1  
            ++j;  
        }  
  
        // iС��0���ߴ��ڱ���1  
        if (j > i || p == null)  
        {  
            // �׳��쳣  
            throw new Exception("��" + i + "��Ԫ�ز�����");  
        }  
  
        // ���ؽ��p���������ֵ  
        p.setData(x); 
		return true;
	}
    public void add(Object x) throws Exception{
	    insert(length(),x);
	
    }
	public void insert(int i, Object x) throws Exception {
		// ��ʼ����pָ���׽�㣬jΪ������  
        Node p = head;  
  
        int j = -1;  
  
        // Ѱ�ҵ�i������ǰ��  
        while (p != null && j < i - 1)  
        {  
            p = p.getNext();  
  
            // ��������1  
            ++j;  
        }  
  
        // i���Ϸ�  
        if (j > i - 1 || p == null)  
        {  
            // �׳��쳣  
            throw new Exception("����λ�ò��Ϸ�");  
        }  
  
        // �����½��  
        Node s = new Node(x);  
  
        // �޸�����ʹ�½����뵽��������  
        s.setNext(p.getNext());  
  
        p.setNext(s);  
		
	}
	public void insert2(int i, Object x) throws Exception  
    {  
        // ��ʼ����pָ���׽�㣬jΪ������  
        Node p = head;  
  
        int j = 0;  
  
        // ��i = -1\0\1����  
        while (p != null && j < i - 1)  
        {  
            p = p.getNext();  
  
            ++j;  
        }  
  
        if (j > i || p == null)  
        {  
            throw new Exception("����λ�ò��Ϸ�");  
        }  
  
        Node s = new Node(x);  
  
        // ����λ��Ϊ��ͷʱ  
        if (i == 0)  
        {  
            s.setNext(head);  
  
            head = s;  
        }  
        // ����λ��Ϊ����м���βʱ  
        else  
        {  
            s.setNext(p.getNext());  
  
            p.setNext(s);  
        }  
    }  
	public void remove(int i) throws Exception {
		 // ��ʼ����pָ���׽�㣬jΪ������  
        Node p = head;  
  
        int j = -1;  
  
        // Ѱ�ҵ�i������ǰ��  
        while (p.getNext() != null && j < i - 1)  
        {  
            p = p.getNext();  
  
            ++j;  
        }  
        if (j > i - 1 || p.getNext() == null)  
        {  
            throw new Exception("ɾ��λ�ò��Ϸ�");  
        }  
  
        // �޸���ָ�룬ʹ��ɾ�����ӵ�����������  
        p.setNext(p.getNext().getNext());  
		
	}

	public int indexOf(Object x) {
		// ��ʼ����pָ���׽�㣬jΪ������  
        Node p = head.getNext();  
  
        int j = 0;  
  
        // ����ӵ������е��׽�㿪ʼ���ң�ֱ��p.getData()Ϊx�򵽴ﵥ����ı�β  
        while (p != null && !p.getData().equals(x))  
        {  
            // ָ����һ�����  
            p = p.getNext();  
  
            // ��������1  
            ++j;  
        }  
  
        // ��pָ�������е�ĳ����㣬����ֵΪx�Ľ���ڵ������е�λ��  
        if (p != null)  
        {  
            return j;  
        } else  
        {  
            // ֵΪx�Ľ�㲻��������  
            return -1;  
        }  
	}

	public void display() {
		//ȡ����ͷ���ĵ������е��׽��  
        Node p = head.getNext();  
          
        while(p != null)  
        {  
            //�������ֵ  
            System.out.print(p.getData() + " ");  
              
            //ȡ��һ�����  
            p = p.getNext();  
        }  
          
        //����  
        System.out.println();  
    }  
		
}
