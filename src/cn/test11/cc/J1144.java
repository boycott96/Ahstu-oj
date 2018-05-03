package cn.test11.cc;

import java.util.Scanner;

public class J1144 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int m = cn.nextInt();
		for (int i = n; i <= m; i++) {
			if (isPrime(i) && invert(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean invert(int i) {
		int a = 0, b = i;
		while (i > 0) {
			a = a * 10 + i % 10;
			i /= 10;
		}
		if (a == b)
			return true;
		return false;
	}

	private static boolean isPrime(int n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;
		for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
