package test.twelve_26;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
			System.out.println("method��������");
		} catch (RuntimeException ex) {
			System.out.println("main�����е�RuntimeException");
		} catch (Exception ex) {
			System.out.println("main�����е�Exception");
		}

	}

	static void method() throws Exception {
		try {
			CircleWithCustomException c1 = new CircleWithCustomException(1);
			c1.setRadius(-1);
			System.out.println(c1.getRadius());
		} catch (RuntimeException ex) {
			System.out.println("method�����е�RuntimeException");
		} catch (Exception ex) {
			System.out.println("method�����е�Exception");
			throw ex;
		}
	}

}
