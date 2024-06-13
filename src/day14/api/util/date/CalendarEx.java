package day14.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance(); //이 안에 날짜, 시간 등이 들어있음.

		int year = Calendar.getInstance().get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH );
		int day = cal.get(Calendar.DATE );
		int hour = cal.get( Calendar.HOUR );
		int minute = cal.get( Calendar.MINUTE );
		int second = cal.get( Calendar.SECOND );
		
		//2024-4-31 10:33:30
		System.out.println(year + "-" + month + "-" + day + " " + hour +":" + minute + ":" + second);
		
	}
}