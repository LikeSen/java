package example.twelve_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.print("輸入一個整數：");
				int number = input.nextInt();
				System.out.println("輸入數據為：" + number);
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("輸入錯誤，請輸入正數");
				input.nextLine();
			}

		} while (continueInput);
		
		
	}
	
}
