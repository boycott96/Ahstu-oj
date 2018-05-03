package cn.test11.cc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J1134 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int year = cn.nextInt();
			int month = cn.nextInt();
			int day = cn.nextInt();
			Date date = new Date(year - 1900, month - 1, day);
			SimpleDateFormat form = new SimpleDateFormat("yyyy-M-d");
			date.setDate(date.getDate() + 10000);
			String str = form.format(date);
			System.out.println(str);
		}
		cn.close();
	}
}
