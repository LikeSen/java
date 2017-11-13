package exserice.nine_4;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random(1000);
//		r.nextInt(100);
//		System.out.println(r.nextInt(100));
		for(int i=0;i<50;i++){
			System.out.println(r.nextInt(100));	
		}
		
	}

}
