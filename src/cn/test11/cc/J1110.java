package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1110 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int a[] = new int[4];
		while (n-- > 0) {
			for (int i = 0; i < 4; i++)
				a[i] = cn.nextInt();
			Arrays.sort(a);
			for (int i = 0; i < 4; i++) {
				int s = 5;
				for (int j = 0; j < 4; j++) {
					if (j == i)
						continue;
					for (int k = 0; k < 4; k++) {
						if (k == j || k == i)
							continue;
						for (int t = 0; t < 4; t++) {
							if (t == k || t == i || t == j)
								continue;
							System.out.print("" + a[i] + a[j] + a[k] + a[t]);
							if (s > 0)
								System.out.print(" ");
							s--;
						}
					}
				}
				System.out.println();
			}
			if (n != 0)
				System.out.println();
		}
	}
}