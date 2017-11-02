package com.integer;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i01=59;
		int i02=59;
		Integer i03=Integer.valueOf(59);
		Integer i04=new Integer(59);
		Integer i05=new Integer(59);
		System.out.println(i01==i02);
		System.out.println(i01==i03);
		System.out.println(i03==i04);
		System.out.println(i02==i04);
		System.out.println(i04==i05);
		System.out.println(i04.equals(i05));
		
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
