package test.seventeen_33;


import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf =new RandomAccessFile("test.dat", "r");
			int i=raf.readInt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO exception");
		}
		
	}

}
