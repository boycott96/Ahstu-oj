package cn.test10.cc;

import java.util.Scanner;

public class J1055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int f[] = new int[m];
		int g[] = new int[n];
		for (int i = 0; i < m; i++) {
			f[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			g[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int z = Math.abs(f[i] - g[j]);
				if (min > z) {
					min = z;
				}
			}
		}
		System.out.println(min);
		sc.close();
	}
}
