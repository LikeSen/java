package test.seventeen_30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));

		) {
			output.writeObject(new A());
		}
	}

}

class A implements Serializable {
	B b = new B();
}

class B {

}
