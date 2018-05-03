package cn.test11.cc;

import java.util.Scanner;

public class J1172 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int len = n * 2 + 1;
		int[][] num = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				num[i][j] = j + 1;
			}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				num[i][j] = i + 1;
			}
		}
		int[][] nn = new int[len][len];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nn[i][j] = num[n - i - 1][n - j - 1];
			}
		}
		for (int i = 0; i < n; i++) {
			nn[i][n] = n - i;
		}
		for (int i = 0; i < n; i++) {
			for (int j = n + 1; j < len; j++) {
				nn[i][j] = num[n - i - 1][j - n - 1];
			}
		}
		for (int i = 0; i < n; i++) {
			nn[n][i] = n - i;
		}
		for (int i = n + 1; i < len; i++) {
			for (int j = 0; j < n; j++) {
				nn[i][j] = num[i - n - 1][n - j - 1];
			}
		}
		for (int i = n; i < len; i++) {
			nn[i][n] = i - n;
		}
		for (int i = n + 1; i < len; i++) {
			for (int j = n + 1; j < len; j++) {
				nn[i][j] = num[i - n - 1][j - n - 1];
			}
		}
		for (int i = n; i < len; i++) {
			nn[n][i] = i - n;
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(" " + nn[i][j]);
			}
			System.out.println();
		}
	}
}
