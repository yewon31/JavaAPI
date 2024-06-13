package day14.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//날짜를 나타내는 데이트객체
		Date date = new Date();

		System.out.println(date); //Fri May 31 09:37:09 KST 2024
		
		//날짜 -> String 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E요일");
		String now2 = sdf2.format(date);
		System.out.println(now2);

		System.out.println("--------------------------------------------------------");

		//날짜형식 String -> 날짜타입 형변환
		String str = "2024-05-31 09:22:21";

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
		Date d = sdf3.parse(str);
			System.out.println("변경된 날짜타입 : " + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}