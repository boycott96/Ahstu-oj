package cn.test14.cc;

import java.util.Scanner;

public class J1427 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t = cn.nextInt();
		while (t-- > 0) {
			int a = cn.nextInt();
			int b = cn.nextInt();
			int c = cn.nextInt();
			int d = cn.nextInt();

			int s = Math.abs(a * b - c * d);
			System.out.println(s);
		}
	}
}
