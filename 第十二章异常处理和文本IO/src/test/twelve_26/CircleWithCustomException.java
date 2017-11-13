package test.twelve_26;

public class CircleWithCustomException {
	private double radius;
	private static int numberOfObject = 0;

	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);

	}

	public CircleWithCustomException(double radius) throws InvalidRadiusException {
		setRadius(radius);
		numberOfObject++;
	}

	public void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius >= 0) {
			this.radius = newRadius;
		} else {
			throw new InvalidRadiusException(newRadius);
		}

	}

	public static int getNumberOfObject() {
		return numberOfObject;
	}

	public double getRadius() {
		return radius;
	}

	public double findArea() {
		return radius * radius * Math.PI;
	}

}
