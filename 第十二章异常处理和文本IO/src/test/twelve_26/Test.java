package test.twelve_26;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
			System.out.println("method方法后面");
		} catch (RuntimeException ex) {
			System.out.println("main方法中的RuntimeException");
		} catch (Exception ex) {
			System.out.println("main方法中的Exception");
		}

	}

	static void method() throws Exception {
		try {
			CircleWithCustomException c1 = new CircleWithCustomException(1);
			c1.setRadius(-1);
			System.out.println(c1.getRadius());
		} catch (RuntimeException ex) {
			System.out.println("method方法中的RuntimeException");
		} catch (Exception ex) {
			System.out.println("method方法中的Exception");
			throw ex;
		}
	}

}
