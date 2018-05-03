package cn.test10.cc;

import java.util.Scanner;

public class J1081 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			if (n == 0)
				return;
			int len = 0;
			int len1 = 0;
			int[] a = new int[1001];
			int[] b = new int[1001];
			int[] z = new int[1001];
			for (int i = 0; i < n; i++) {
				a[i] = cn.nextInt();
			}
			sort(a, n);
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (compare(a[i], a[j])) {
						z[len] = a[j];
						len++;
						break;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				boolean flag = false;
				for (int j = 0; j < len; j++) {
					if (compare(z[j], a[i])) {
						flag = true;
					}
				}
				if (!flag) {
					b[len1] = a[i];
					len1++;
				}
			}
			if (len1 == 0) {
				System.out.println("None");
			} else {
				for (int i = 0; i < len1 - 1; i++) {
					System.out.print(b[i] + " ");
				}
				System.out.println(b[len1 - 1]);
			}

		}
	}

	private static boolean compare(int q, int w) {
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i = 0, j = 0;
		while (q > 0) {
			x[i] = q % 10;
			q /= 10;
			i++;
		}
		while (w > 0) {
			y[j] = w % 10;
			w /= 10;
			j++;
		}
		sort(x, i);
		sort(y, j);
		if (i != j) {
			return false;
		} else {
			for (int k = 0; k < i; k++) {
				if (x[k] != y[k])
					return false;
			}
		}
		return true;
	}

	private static void sort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
}
