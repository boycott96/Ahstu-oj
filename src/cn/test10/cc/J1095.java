package cn.test10.cc;

import java.util.Scanner;

public class J1095 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			String str = cn.nextLine();
			str = str.toUpperCase();
			System.out.println(str);
		}
		cn.close();
	}
}
