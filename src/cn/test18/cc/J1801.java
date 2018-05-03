package cn.test18.cc;

import java.util.Scanner;

public class J1801 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int a1 = cn.nextInt();
			int b1 = cn.nextInt();
			int a2 = cn.nextInt();
			int b2 = cn.nextInt();
			if (a1 == a2) {
				System.out.println("INF");
			} else {
				int k = Math.abs(b1 - b2) / Math.abs(a1 - a2);
				System.out.println(k);
			}
		}
		cn.close();
	}
}
