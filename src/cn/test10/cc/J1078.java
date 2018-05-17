package cn.test10.cc;

import java.util.Scanner;

public class J1078 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			if (n == 0)
				break;
			System.out.println(Odd(n));
		}
		cn.close();
	}

	private static int Odd(int n) {
		return n == 1 ? 0 : 1 + Odd(n % 3 == 0 ? n / 3 : n / 3 + 1);
	}
}
