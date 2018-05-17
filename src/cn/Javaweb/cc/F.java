package cn.Javaweb.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] a = new Integer[32];
		a[0] = 1;
		a[31] = Integer.MAX_VALUE;
		for (int i = 1; i < 31; i++) {
			a[i] = a[i - 1] * 2;
		}
		while (sc.hasNext()) {
			String n = sc.next();
			Integer num = Integer.parseInt(n);
			for (int i = 3; i < 31; i++) {
				if (num > a[i] && num < a[i + 1]) {
					Integer L1 = num - a[i];
					Integer L2 = a[i + 1] - num + 1;
					if (L1 > L2) {
						if (a[i + 1] == Integer.MAX_VALUE) {
							System.out.println(new BigInteger(a[i + 1].toString()).add(new BigInteger("1")));
							break;
						} else {
							System.out.println(a[i + 1]);
							break;
						}
					} else {
						System.out.println(a[i]);
						break;
					}
				}
			}
		}
		sc.close();
	}
}
