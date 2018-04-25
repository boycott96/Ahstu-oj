package cn.test20.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:33:59 PMApr 10, 2018
 *
 */
public class J2044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int min = Math.min(Math.min(a, b), c);
			int max = Math.max(Math.max(a, b), c);
			System.out.println(a+b+c-min-max);
		}
		sc.close();
	}
}
