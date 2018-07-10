package cn.test.cc;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int year = sc.nextInt();
			System.out.println(year + ":" + (judgeLeap(year) ? "is leap year" : "not is leap year"));
		}
		sc.close();
	}

	private static boolean judgeLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
