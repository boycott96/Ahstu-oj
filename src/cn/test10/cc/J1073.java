package cn.test10.cc;

import java.util.Scanner;

public class J1073 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int z = cn.nextInt();
			int n = z / 5;
			int m = z / 2;
			int count = 0;
			for (int i = 1; i <= z; i++) {
				for (int j = 1; j <= n; j++) {
					for (int k = 1; k <= m; k++) {
						if (i + j * 5 + k * 2 == z) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
		cn.close();
	}
}
