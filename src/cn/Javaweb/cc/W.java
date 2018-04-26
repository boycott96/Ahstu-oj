package cn.Javaweb.cc;

import java.util.Scanner;

public class W {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] anum = new int[10000];
			for (int i = 0; i < n; i++) {
				anum[i] = sc.nextInt();
			}
			int num = sc.nextInt();
			if (num > Math.sqrt(n)) {
				System.out.println("EMPTY");
				continue;
			}
			int temp = (int) Math.pow(2, num - 1);
			int tempend = (int) Math.pow(2, num);
			for (int i = temp - 1; i < tempend-1 && i < n; i++) {
				if(i==temp-1) {
					System.out.print(anum[i]);
					continue;
				}
				System.out.print(" "+anum[i]);
			}
			System.out.println();
			/**
			 * String[][] str = new String[1000][1000]; int z =0; for (int i = 0; i <
			 * Math.sqrt(n); i++) { for (int j = 0; j < Math.pow(2, i); j++) { str[i][j] =
			 * sc.next(); z++; if(z==n) break; } } int t = sc.nextInt(); if (t >
			 * Math.sqrt(n)) { System.out.println("EMPTY"); continue; } for (int i = 0; i <
			 * Math.pow(2, t - 1); i++) { if (i == 0) { System.out.print(str[t - 1][i]);
			 * continue; } System.out.print(" " + str[t - 1][i]); } System.out.println();
			 */
		}
		sc.close();
	}
}