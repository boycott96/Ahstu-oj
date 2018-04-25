package cn.test13.cc;

import java.util.Scanner;

public class J1321 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = cn.nextInt();
			y[i] = cn.nextInt();
		}
		int max = 2;
		for (int i = 0; i < n; i++) {
			int count = 2;
			for (int j = i + 1; j < n; j++) {
				int dy = Math.abs(y[i] - y[j]);
				int dx = Math.abs(x[i] - x[j]);
				double k = 1.0 * dy / dx;
				double b = Math.abs(1.0 * (x[i] * y[j] - x[j] * y[i]) / dx);
				for (int l = j + 1; l < n; l++) {
					double s = y[l];
					double z = k * x[l] + b;
					if (z == s) {
						count++;
					}
				}
			}
			if (max < count)
				max = count;
		}
		System.out.println(max);
		cn.close();
	}
}
