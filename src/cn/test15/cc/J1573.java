package cn.test15.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 1:56:10 PMApr 6, 2018
 *
 */
public class J1573 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			System.out.println(witchMirror(str));
		}
		sc.close();
	}

	private static int witchMirror(String str) {
		int n = str.length();
		if (n == 1)
			return 1;
		String halfstr = str.substring(0, n / 2);
		String otherHalfstr = new StringBuffer(str.substring(n / 2)).reverse().toString();
		if (halfstr.equals(otherHalfstr)) {
			return witchMirror(halfstr);
		}
		return n;
	}
}
