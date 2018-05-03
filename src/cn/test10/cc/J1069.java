package cn.test10.cc;

import java.util.Scanner;

public class J1069 {
	static double n = 0.0000000001;

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int[] z = new int[10];
		while (cn.hasNext()) {
			String str = cn.next();
			String[] s = str.split("/");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			double num = (double) a / b;
			System.out.print('.');
			for (int i = 0; i < 9; i++) {
				num *= 3;
				z[i] = (int) (num + n);
				num -= (int) (double) num + n;
			}
			num *= 3;
			int an = (int) (double) (num + n);
			num -= (int) (double) num + n;
			if ((double) (num * 3 + n) >= 2 && an <= 1)
				z[9] = an + 1;
			else if ((double) (num * 3 + n) >= 2 && an >= 2) {
				z[9] = an + 1 - 3;
				z[8] = z[8] + 1;
				if (z[8] >= 3) {
					z[8] = z[8] - 3;
					z[7] = z[7] + 1;
					if (z[7] >= 3) {
						z[7] = z[7] - 3;
						z[6] = z[6] + 1;
						if (z[6] >= 3) {
							z[6] = z[6] - 3;
							z[5] = z[5] + 1;
							if (z[5] >= 3) {
								z[5] = z[5] - 3;
								z[4] = z[4] + 1;
								if (z[4] >= 3) {
									z[4] = z[4] - 3;
									z[3] = z[3] + 1;
									if (z[3] >= 3) {
										z[3] = z[3] - 3;
										z[2] = z[2] + 1;
										if (z[2] >= 3) {
											z[2] = z[2] - 3;
											z[1] = z[1] + 1;
											if (z[1] >= 3) {
												z[1] = z[1] - 3;
												z[0] = z[0] + 1 - 3;
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				z[9] = an;
			}
			for (int i = 0; i < 10; i++) {
				System.out.print(z[i]);
			}
			System.out.println();
		}
		cn.close();
	}
}
