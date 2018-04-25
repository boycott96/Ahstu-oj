package cn.test11.cc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class J1140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String dateStr = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date startDate = null;
			try {
				startDate = sdf.parse(dateStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Calendar startCalendar = Calendar.getInstance();
			startCalendar.setTime(startDate);
			int index = startCalendar.get(Calendar.DAY_OF_YEAR);
			System.out.println(index);
		}
		sc.close();
	}
}
