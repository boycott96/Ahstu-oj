package cn.test10.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:07:57 PMApr 9, 2018
 *
 */
public class J1036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double s = 100;
		double h = 200;
		while (n-- > 1) {
			h /= 2;
			s += h;
		}
		System.out.format("%.4f\n",s);
		sc.close();
	}
}
