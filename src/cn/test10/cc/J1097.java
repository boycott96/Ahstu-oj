package cn.test10.cc;

import java.util.Scanner;

public class J1097 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String str = cn.nextLine();
		System.out.println(new StringBuilder(str).reverse().toString());
		cn.close();
	}
}
