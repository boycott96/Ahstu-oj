package cn.test25.cc;

import java.util.Scanner;

public class J2551 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ostr = sc.next();
		if (str.length() != ostr.length())
			System.out.println(1);
		else if (str.equals(ostr))
			System.out.println(2);
		else if (str.toLowerCase().equals(ostr.toLowerCase()))
			System.out.println(3);
		else if (str.toLowerCase().equals(new StringBuffer(ostr.toLowerCase()).reverse().toString()))
			System.out.println(4);
		else System.out.println(5);
		sc.close();
	}
}
