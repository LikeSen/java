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
				System.out.print("ݔ��һ��������");
				int number = input.nextInt();
				System.out.println("ݔ�딵���飺" + number);
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("ݔ���e�`��Ոݔ������");
				input.nextLine();
			}

		} while (continueInput);
		
		
	}
	
}
