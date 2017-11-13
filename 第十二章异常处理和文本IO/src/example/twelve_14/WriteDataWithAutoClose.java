package example.twelve_14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File file = new File("b.txt");
		if (file.exists()) {
			System.out.println("�ļ��Ѿ�����");
			System.exit(1);
		}

		try (
				// ��������
				PrintWriter output = new PrintWriter(file);
				) {
			// �������
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}

}
