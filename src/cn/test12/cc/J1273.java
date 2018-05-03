package cn.test12.cc;

import java.util.Scanner;

public class J1273 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int a = cn.nextInt();
		int b = cn.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
	}
}
