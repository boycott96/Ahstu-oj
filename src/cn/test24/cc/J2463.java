package cn.test24.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:09:12 PMApr 11, 2018
 *
 */
public class J2463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double l = 1.0*(a+b+c)/2;
		double s = Math.sqrt(l*(l-a)*(l-b)*(l-c));
		System.out.format("%.3f\n",s);
		sc.close();
	}
}
