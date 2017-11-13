package example.twelve_12;

import java.io.File;
import java.util.Date;

public class TestFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\JavaSE_WorkSpace\\GUI\\bin\\cn\\itcast_01");
		
		System.out.println("是否存在？"+file.exists());
		System.out.println("文件有"+file.length()+"字节");
		System.out.println("是否可读？"+file.canRead());
		System.out.println("是否可写？"+file.canWrite());
		System.out.println("是否为目录？"+file.isDirectory());
		System.out.println("是否为文件？"+file.isFile());
		System.out.println("是不是绝对路径？"+file.isAbsolute());
		System.out.println("是否隐藏？"+file.isHidden());
		System.out.println("绝对路径是:"+file.getAbsolutePath());
		System.out.println("最后一次修改时间是："+new Date(file.lastModified()));
	}

}
