package cn.test.cc;

import java.util.Scanner;

public class Tprime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i <= n / 2; i++) {
			if (isPrime(i) && isPrime(n - i))
				result++;
		}
		System.out.println(result);
		sc.close();
	}

	private static boolean isPrime(int a) {
		if (a == 2)
			return true;
		if (a < 2 || a % 2 == 0)
			return false;
		for (int c = 3; c <= Math.sqrt(a); c += 2) {
			if (a % c == 0)
				return false;
		}
		return true;
	}
}
