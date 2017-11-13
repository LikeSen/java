package example.twelve_13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

	public static void main(String[] args) throws IOException {
		//创建文件对象
		File file =new File("a.txt");
		if(file.exists()){
			System.out.println("文件已经存在");
			System.exit(1);
		}
	    //创建对象
		PrintWriter output =new PrintWriter(file);
		//输出数据
		output.print("John T Smith ");
		output.println(99);
		output.print("Eric K Jones ");
		output.println(85);
		//释放资源
		output.close();
	}

}
