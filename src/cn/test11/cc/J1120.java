package cn.test11.cc;

import java.util.Scanner;

public class J1120 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int[][] num = new int[100][3];
		int[] t = new int[3];
		int p = 0;
		while (cn.hasNext()) {
			String str = cn.next();
			String[] da = str.split("/");
			int a = Integer.parseInt(da[0]);
			int b = Integer.parseInt(da[1]);
			int c = Integer.parseInt(da[2]);
			num[p][0] = a;
			num[p][1] = b;
			num[p][2] = c;
			p++;
		}
		for (int i = 0; i < p - 1; i++) {
			for (int j = 0; j < p - 1 - i; j++) {
				if (num[j][1] > num[j + 1][1]) {
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < p - 1; i++) {
			for (int j = 0; j < p - 1 - i; j++) {
				if (num[j][0] > num[j + 1][0]) {
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < p - 1; i++) {
			for (int j = 0; j < p - 1 - i; j++) {
				if (num[j][2] > num[j + 1][2]) {
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < p; i++)
			System.out
					.printf("%02d/%02d/%d\n", num[i][0], num[i][1], num[i][2]);
		cn.close();
	}
}
