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
//== 1. 可以比较基本数据类型，比较基本数据类型的值是否相等。
//   2. 用于比较引用数据类型，比较对象的地址是否相同。

// equals只能用于比较引用数据类型。
//Object类提供的equals方法比较对象的地址是否相同。因为内部使用==实现
//Integer,String 等类已经对Object类中的equals方法重写了，用于比较对象的内容（值）是否相同。

//自定类中，可以根据自己的需要重写equals方法。
