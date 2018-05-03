package cn.test10.cc;

import java.util.Scanner;

public class J1078 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			if (n == 0)
				return;
			int z = 0;
			if (n == 3) {
				z++;
				System.out.println(z);
			} else {
				if (n % 2 != 0) {
					n--;
					while (n > 3) {
						n /= 2;
						z++;
					}
					System.out.println(z);
				} else {
					while (n >= 3) {
						n /= 2;
						z++;
					}
					System.out.println(z);
				}
			}
		}
	}
}
