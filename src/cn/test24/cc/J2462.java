package cn.test24.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:11:34 PMApr 10, 2018
 *
 */
public class J2462 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Math.max(a, b)%Math.min(a, b));
		sc.close();
	}
}
