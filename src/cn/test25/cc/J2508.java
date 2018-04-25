package cn.test25.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 2:14:37 PMApr 10, 2018
 *
 */
public class J2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int n = a*d+b*c;
			int m = b*d;
			int l = gcd(n,m);
			System.out.println(n/l+" "+m/l);
		}
		sc.close();
	}

	private static int gcd(int a, int b) {
		if(a==0) return b;
		return gcd(b%a,a);
	}
}
