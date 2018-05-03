package cn.test10.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class J1072 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			System.out.println(Factorial(n - 1));
		}
		cn.close();
	}

	private static BigInteger Factorial(int n) {
		return n <= 1 ? new BigInteger(Integer.toString(1)) : Factorial(n - 1)
				.multiply(new BigInteger(Integer.toString(n)));
	}

}
