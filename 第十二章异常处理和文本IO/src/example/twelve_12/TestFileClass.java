package example.twelve_12;

import java.io.File;
import java.util.Date;

public class TestFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\JavaSE_WorkSpace\\GUI\\bin\\cn\\itcast_01");
		
		System.out.println("�Ƿ���ڣ�"+file.exists());
		System.out.println("�ļ���"+file.length()+"�ֽ�");
		System.out.println("�Ƿ�ɶ���"+file.canRead());
		System.out.println("�Ƿ��д��"+file.canWrite());
		System.out.println("�Ƿ�ΪĿ¼��"+file.isDirectory());
		System.out.println("�Ƿ�Ϊ�ļ���"+file.isFile());
		System.out.println("�ǲ��Ǿ���·����"+file.isAbsolute());
		System.out.println("�Ƿ����أ�"+file.isHidden());
		System.out.println("����·����:"+file.getAbsolutePath());
		System.out.println("���һ���޸�ʱ���ǣ�"+new Date(file.lastModified()));
	}

}
