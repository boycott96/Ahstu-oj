package cn.test11.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class J1131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(factorial(a).divide((factorial(a - b).multiply(factorial(b)))));
		}
		sc.close();
	}

	private static BigInteger factorial(int a) {
		if (a <= 1)
			return new BigInteger(Integer.toString(1));
		return new BigInteger(Integer.toString(a)).multiply(factorial(a - 1));

	}
}
