package cn.test16.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:14:03 AMApr 4, 2018
 *
 */
public class J1633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int m = a*b/gcd(a,b);
			int n = m*c/gcd(m,c);
			System.out.println(n);
		}
		sc.close();
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
