package example.twelve_13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws IOException {
		//�����ļ�����
		File file =new File("a.txt");
		if(file.exists()){
			System.out.println("�ļ��Ѿ�����");
			System.exit(1);
		}
	    //��������
		PrintWriter output =new PrintWriter(file);
		//�������
		output.print("John T Smith ");
		output.println(99);
		output.print("Eric K Jones ");
		output.println(85);
		//�ͷ���Դ
		output.close();
	}

}
