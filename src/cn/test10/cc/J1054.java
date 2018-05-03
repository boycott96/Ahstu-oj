package cn.test10.cc;

import java.util.Scanner;

public class J1054 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int m = cn.nextInt();
		int n = cn.nextInt();
		int k = cn.nextInt();
		if (n < k)
			System.out.println(0);
		else {
			int s1 = 1;
			for (int i = 1; i <= k; i++) {
				s1 *= i;
			}
			int s2 = 1;
			for (int i = 1; i <= n; i++) {
				s2 *= i;
			}
			int[][] dd = new int[20][20];
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					dd[i][j] = 0;
				}
			}
			dd[1][0] = 1;
			dd[1][1] = 1;
			for (int i = 2; i <= n; i++) {
				for (int j = 0; j <= i; j++) {
					for (int e = 0; e <= j; e++) {
						dd[i][j] += dd[i - 1][e];
					}
				}
			}
			System.out.println(dd[n][k] * s2 * s1);
		}
		cn.close();
	}
}
