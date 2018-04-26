package cn.Javaweb.cc;

import java.util.Scanner;

public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			int index = str.indexOf("@");
			String s = str.substring(0, index);
			System.out.println(s);
		}
		sc.close();
	}
}
