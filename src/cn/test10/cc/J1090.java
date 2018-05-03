package cn.test10.cc;

import java.util.Scanner;

public class J1090 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int counts = 0;
		int j = n / 2;
		for (int i = n / 2; i > 0; i--) {
			if (isPrime(j) && isPrime(i)) {
				if (j + i == n)
					counts++;
			}
			j++;
		}
		System.out.println(counts);
		cn.close();
	}

	private static boolean isPrime(int n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;
		int m = (int) Math.sqrt(n);
		for (int k = 3; k <= m; k += 2)
			if (n % k == 0)
				return false;
		return true;
	}
}
