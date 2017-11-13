package nine;

public class TestSimpleCircle {
	public static void main(String[] args) {
		//无参构造 半径1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("半径为：" + circle1.radius + "的圆的面积是：" + circle1.getArea());
		//有参构造  半径25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("半径为：" + circle2.radius + "的圆的面积是：" + circle2.getArea());
		
		//有参构造 半径125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("半径为：" + circle3.radius + "的圆的面积是：" + circle3.getArea());
		
		//改变半径
		circle2.radius=100;
		//circle2.setRadius(100);
		System.out.println("半径为：" + circle2.radius + "的圆的面积是：" + circle2.getArea());
		
		
	}

}

class SimpleCircle {

	double radius;
	//	无参构造
	SimpleCircle() {
		radius = 1;
	}
	//有参构造
	SimpleCircle(double newRadius) {
		radius = newRadius;

	}
	//求面积
	double getArea() {
		return radius * radius * Math.PI;

	}
	//求周长
	double getPerimeter() {
		return 2 * radius * Math.PI;

	}
	//设置半径
	void setRadius(double newRadius) {
		radius = newRadius;
	}

}