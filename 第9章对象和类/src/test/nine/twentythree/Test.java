package test.nine.twentythree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count myCount = new Count();
		int times =0;
		
		for(int i=0;i<100;i++){
			increment(myCount ,times);
//			System.out.println("count is "+myCount.count);
//			System.out.println("times is "+ times);
		}
		System.out.println("count is "+myCount.count);
		System.out.println("times is "+ times);
	}

	private static void increment(Count c,int times) {
		// TODO Auto-generated method stub
		c.count++;
		times++;
	}

}
