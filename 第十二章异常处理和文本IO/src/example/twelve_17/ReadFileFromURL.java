package example.twelve_17;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.bind.helpers.PrintConversionEventImpl;

public class ReadFileFromURL {

	public static void main(String[] args) {

		System.out.print("��������ַ��");
		String URLString = new Scanner(System.in).next();
		try {
			URL url = new URL(URLString);
			int count = 0;
			PrintWriter output =new PrintWriter("a.txt");
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				output.println(line);
				count += line.length();
				output.flush();
			}
			System.out.println("����ļ���СΪ��" + count + "�ֽ�");
		} catch (MalformedURLException e) {

			System.out.println("���Ϸ���ַ");
		} catch (IOException e) {
			System.out.println("I/O����û�������ļ�");
		}

	}

}
