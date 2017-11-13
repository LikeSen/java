package example.twelve_14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

	public static void main(String[] args) throws IOException {
		// 创建文件对象
		File file = new File("b.txt");
		if (file.exists()) {
			System.out.println("文件已经存在");
			System.exit(1);
		}

		try (
				// 创建对象
				PrintWriter output = new PrintWriter(file);
				) {
			// 输出数据
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}

}
