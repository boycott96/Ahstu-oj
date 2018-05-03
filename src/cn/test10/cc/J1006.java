package cn.test10.cc;

import java.util.Scanner;

public class J1006 {
	public static void main(String[] args) {
		String regex = "((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))";
		//使用正则表达式计算，最主要就是正则表达式的书写规范
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			String str = cn.nextLine();
			if (str.matches(regex)) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
		cn.close();
	}
}
