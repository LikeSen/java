package example.twelve_15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		File file =new File("a.txt");
		Scanner input=new Scanner(file);
		while(input.hasNext()){
			String firstName=input.next();
			String mi =input.next();
			String lastName=input.next();
			String score =input.next();
			System.out.println(firstName+"  "+mi+"  "+lastName+"  "+score);
			
		}
		input.close();
	}

}
