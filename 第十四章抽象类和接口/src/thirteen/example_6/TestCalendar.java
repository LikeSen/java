package thirteen.example_6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		System.out.println("��ǰʱ�䣺" + new Date());
		System.out.println("�꣺" + calendar.get(calendar.YEAR));
		System.out.println("�£�" + calendar.get(calendar.MONTH));
		System.out.println("�գ�" + calendar.get(calendar.DATE));
		System.out.println("Сʱ��" + calendar.get(calendar.HOUR));
		System.out.println("HOUR_OF_DAY:" + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("���ӣ�" + calendar.get(calendar.MINUTE));
		System.out.println("�룺" + calendar.get(calendar.SECOND));
		System.out.println("DAY_OF_WEEK:" + calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MONTH:" + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR:" + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MONTH:" + calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_TEAR:" + calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("AM_PM:" + calendar.get(calendar.AM_PM));

		Calendar calendar1 = new GregorianCalendar(2017,3,5);
		String[] dayNumberOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("DAY_OF_WEEK:" + calendar1.get(calendar1.DAY_OF_WEEK));
		System.out.println("2017��4��5����" + dayNumberOfWeek[calendar1.get(calendar1.DAY_OF_WEEK) - 1]);
	}

}
