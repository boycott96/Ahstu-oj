package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:01:14 AMApr 4, 2018
 *
 */
public class J1526 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(getDays(m,isLeapYear(y)));
		sc.close();
	}

	private static boolean isLeapYear(int y) {
		if(y%4==0&&y%100!=0||y%400==0) return true;
		return false;
	}

	private static int getDays(int m, boolean boo) {
		int days = 0;
		switch(m) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;break;
		case 2: days=28;break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=31;break;
		}
		if(boo&&m==2) days++;
		return days;
	}
}
