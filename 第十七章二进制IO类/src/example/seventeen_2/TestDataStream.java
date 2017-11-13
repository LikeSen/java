package example.seventeen_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream output=new DataOutputStream(new FileOutputStream("temp2.dat"));
		
		output.writeUTF("John");
		output.writeDouble(85.5);
		output.writeUTF("Jim");
		output.writeDouble(185.5);
		output.writeUTF("George");
		output.writeDouble(105.25);
		
		output.close();
		try{
		DataInputStream input=new DataInputStream(new FileInputStream("temp2.dat"));
		while(true){
		System.out.println(input.readUTF()+"---"+input.readDouble());
		System.out.println(input.readUTF()+"---"+input.readDouble());
		System.out.println(input.readUTF()+"---"+input.readDouble());
		}}catch(EOFException e){
			System.out.println("数据读取完毕了");
		}
		
	}

}
