package nine.two;


public class SimpleCircle {

	public static void main(String[] args) {
		//�޲ι��� �뾶1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("�뾶Ϊ��" + circle1.radius + "��Բ������ǣ�" + circle1.getArea());
		//�вι���  �뾶25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("�뾶Ϊ��" + circle2.radius + "��Բ������ǣ�" + circle2.getArea());
				
		//�вι��� �뾶125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("�뾶Ϊ��" + circle3.radius + "��Բ������ǣ�" + circle3.getArea());
				
		//�ı�뾶
		circle2.radius=100;
		//circle2.setRadius(100);
		System.out.println("�뾶Ϊ��" + circle2.radius + "��Բ������ǣ�" + circle2.getArea());
				
				

	}
	double radius;
	//	�޲ι���
	SimpleCircle() {
		radius = 1;
	}
	//�вι���
	SimpleCircle(double newRadius) {
		radius = newRadius;

	}
	//�����
	double getArea() {
		return radius * radius * Math.PI;

	}
	//���ܳ�
	double getPerimeter() {
		return 2 * radius * Math.PI;

	}
	//���ð뾶
	void setRadius(double newRadius) {
		radius = newRadius;
	}


}
