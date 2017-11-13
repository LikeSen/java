package test.seventeen_18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter output =new PrintWriter("t.txt");
		output.printf("%s", "1234");
		output.printf("%s", "5678");
		output.close();
	}

}
