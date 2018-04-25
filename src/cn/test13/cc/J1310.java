package cn.test13.cc;

import java.util.Scanner;

public class J1310 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		for (int i = n, j = n;; i--, j++) {
			int a = (int) Math.sqrt(i);
			int b = (int) Math.sqrt(j);
			if (a * a == i) {
				System.out.println(i);
				break;
			}
			if (b * b == j) {
				System.out.println(j);
				break;
			}
		}
		cn.close();
	}
}
