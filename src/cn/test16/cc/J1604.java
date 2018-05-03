package cn.test16.cc;

import java.util.Scanner;
/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月30日 下午11:44:56
 */
public class J1604 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.length()!=str2.length()) System.out.println(1);
		else if(str1.equals(str2)) System.out.println(2);
		else if(str1.toLowerCase().equals(str2.toLowerCase())) System.out.println(3);
		else System.out.println(4);
	}
}
