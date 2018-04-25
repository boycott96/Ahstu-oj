package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 2:19:28 PMApr 10, 2018
 *
 */
public class J1552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double max = Double.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			double l = sc.nextDouble();
			max = max<l? l : max;
		}
		System.out.println(max);
		sc.close();
	}
}
