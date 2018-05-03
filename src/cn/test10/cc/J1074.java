package cn.test10.cc;

import java.util.Scanner;

public class J1074 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		while (n-- > 0) {
			int a = cn.nextInt();
			int b = cn.nextInt();
			int c = cn.nextInt();
			int d = cn.nextInt();
			int e = cn.nextInt();
			int f = cn.nextInt();
			int x = a + d;
			int y = b + e;
			int z = c + f;
			if (z >= 60) {
				z = z % 60;
				y++;
				if (y >= 60) {
					y = y % 60;
					x++;
				}
			} else {
				if (y >= 60) {
					y = y % 60;
					x++;
				}
			}
			System.out.println(x + " " + y + " " + z);
		}
		cn.close();
	}
}
