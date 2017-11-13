package test.nine.twentyfour;

public class Test {

	public static void main(String[] args) {
		Circle circle1 = new Circle(1);
		Circle circle2= new Circle(2);
		
		swap1(circle1,circle2);
		System.out.println("swap1 "+circle1.r+"---"+circle2.r);
		
		swap2(circle1,circle2);
		System.out.println("swap2 "+circle1.r+"---"+circle2.r);
	}

	private static void swap2(Circle x, Circle y) {
		double temp=x.r;
		x.r=y.r;
		y.r=temp;
		
	}

	private static void swap1(Circle x, Circle y) {
		Circle temp = x;
		x=y;
		y=temp;
	}

}
