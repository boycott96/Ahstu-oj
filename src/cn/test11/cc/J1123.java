package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation Apr 4, 2018
 *
 */
public class J1123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a*b/gcd(a,b));
		sc.close();
	}

	private static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
