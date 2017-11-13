package thirteen.example_6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar();
		System.out.println("当前时间：" + new Date());
		System.out.println("年：" + calendar.get(calendar.YEAR));
		System.out.println("月：" + calendar.get(calendar.MONTH));
		System.out.println("日：" + calendar.get(calendar.DATE));
		System.out.println("小时：" + calendar.get(calendar.HOUR));
		System.out.println("HOUR_OF_DAY:" + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("分钟：" + calendar.get(calendar.MINUTE));
		System.out.println("秒：" + calendar.get(calendar.SECOND));
		System.out.println("DAY_OF_WEEK:" + calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MONTH:" + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR:" + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MONTH:" + calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_TEAR:" + calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("AM_PM:" + calendar.get(calendar.AM_PM));

		Calendar calendar1 = new GregorianCalendar(2017,3,5);
		String[] dayNumberOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("DAY_OF_WEEK:" + calendar1.get(calendar1.DAY_OF_WEEK));
		System.out.println("2017年4月5号是" + dayNumberOfWeek[calendar1.get(calendar1.DAY_OF_WEEK) - 1]);
	}

}
