package cn.test16.cc;

import java.util.Scanner;

/**
 *
 * @author Huai
 * @creation 12:06:34 PMApr 8, 2018
 *
 */

public class J1641 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int right = 0, left = 0;
			for (int i = 1; i < n; i++) {
				if (a[0] > 0) {
					if (a[0] < Math.abs(a[i]) && a[i] < 0)
						right++;
					if (a[0] > Math.abs(a[i]) && a[i] > 0)
						left++;
				} else {
					if (Math.abs(a[0]) < Math.abs(a[i]) && a[i] < 0)
						right++;
					if (Math.abs(a[0]) > Math.abs(a[i]) && a[i] > 0)
						left++;
				}
			}
			if (right != 0 && left != 0)
				System.out.println(1 + right + left);
			else
				System.out.println(1);
		}
		sc.close();
	}
}
