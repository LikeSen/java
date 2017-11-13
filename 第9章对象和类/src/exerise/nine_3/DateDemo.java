package exerise.nine_3;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		date.setTime(10000);
		System.out.println("时间是："+date.toString());
		date.setTime(100000);
		System.out.println("时间是："+date.toString());
		date.setTime(1000000);
		System.out.println("时间是："+date.toString());
		date.setTime(10000000);
		System.out.println("时间是："+date.toString());
		date.setTime(100000000);
		System.out.println("时间是："+date.toString());
		date.setTime(1000000000);
		System.out.println("时间是："+date.toString());
	
		date.setTime(10000000000L);
		System.out.println("时间是："+date.toString());
		date.setTime(1000000000000L);
		System.out.println("时间是："+date.toString());
	}

}
