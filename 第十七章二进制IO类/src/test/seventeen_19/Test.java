package test.seventeen_19;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream output=new DataOutputStream(new FileOutputStream("t.dat"));
		//output.writeChar('A');
		//output.writeChars("BC");
		output.writeUTF("DEF");
		output.close();
	}

}
