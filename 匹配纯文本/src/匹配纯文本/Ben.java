package Æ¥Åä´¿ÎÄ±¾;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="hello, my name is Ben. Please visit my website at http://www.forta.com/.";
//		Pattern p = Pattern.compile("my");//
//		 Matcher m = p.matcher(s);
//		 boolean b = m.find();
//		
//		System.out.println(b);
//		System.out.println(m.group(0));
		String[] s1={"sales1.xls","orders3.xls","sales2.xls","sales3.xls","apac1.xls",
				"europe2.xls","na1.xls","na2.xls","sa1.xls"};
		
		Pattern pattern=Pattern.compile("sales.");
		for(String s:s1){
			Matcher m=pattern.matcher(s);
			boolean b=m.matches();
			System.out.println(b);
		}
		
		
	}

}
