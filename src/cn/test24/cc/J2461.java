package cn.test24.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:00:22 PMApr 10, 2018
 *
 */
public class J2461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a^b;
		b = a^b;
		a = b^a;
		System.out.println(a+" "+b);
		sc.close();
	}
}
