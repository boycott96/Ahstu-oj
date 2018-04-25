package cn.test25.cc;

import java.util.Scanner;

public class J2507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String strA = sc.next();
			String strB = sc.next();
			int a = Integer.parseInt(strA,16);
			int b = Integer.parseInt(strB,16);
			System.out.println(a+b);
		}
		sc.close();
	}
}
