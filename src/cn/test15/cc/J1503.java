package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:17:05 PMApr 10, 2018
 *
 */
public class J1503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (gcd(a[i], a[j]) == 1)
						count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

	private static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
