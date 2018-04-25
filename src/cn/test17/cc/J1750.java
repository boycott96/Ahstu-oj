package cn.test17.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 12:38:31 PMApr 6, 2018
 *
 */
public class J1750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i : a) {
			if (i <= m + 30)
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
