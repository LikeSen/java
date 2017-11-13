package test;

public class Circle {
	private double radius=1;
	
	public double getArea(){
		return radius*radius*Math.PI;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle();
		System.out.println("Radius is "+ myCircle.radius);
	}

}
