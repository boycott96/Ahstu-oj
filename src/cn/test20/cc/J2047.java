package cn.test20.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:12:48 PMApr 9, 2018
 *
 */
public class J2047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 100 || n > 999) {
			System.out.println(0);
		} else {
			int a = n % 10;
			int b = n / 10 % 10;
			int c = n / 100;
			if (n == a * a * a + b * b * b + c * c * c)
				System.out.println(1);
			else
				System.out.println(0);
		}
		sc.close();
	}
}
