package cn.test10.cc;

import java.util.Scanner;

public class J1077 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[100][100];
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				a[i][0]=a[i][i] = 1;
				if (i > 1) {
					for (int j = 1; j <= i; j++) {
						a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
					}
				}
			}
			for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                for (int k = 0; k < n - i; k++) {
                    System.out.print(a[n - i - 1][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
		}
		sc.close();
	}
}
