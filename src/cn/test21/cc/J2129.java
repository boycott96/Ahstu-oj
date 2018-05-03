package cn.test21.cc;

import java.util.Scanner;

/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月30日 下午11:24:01
 */
public class J2129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[101][101];
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] max = new int[m];
			int[] index = new int[m];
			int[] sum = new int[m];
			for (int i = 0; i < m; i++) {
				max[i] = 0;
				index[i] = 0;
				sum[i] = 0;
				for (int j = 0; j < n; j++) {
					int value = sc.nextInt();
					a[i][j] = value;
					if (value > max[i]) {
						max[i] = value;
						index[i] = j;
					}
					sum[i] += value;
				}
			}

			for (int i = 0; i < m; i++) {
				a[i][index[i]] = sum[i];
			}
			for (int i = 0; i < m; i++) {
				System.out.print(a[i][0]);
				for (int j = 1; j < n; j++) {
					System.out.print(" " + a[i][j]);
				}
				System.out.println();
			}
		}

	}
}
