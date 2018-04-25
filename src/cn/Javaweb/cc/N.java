package cn.Javaweb.cc;

import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < a.length; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = 0;
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j][0] > a[j + 1][0]) {
					int[] temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					a[j][1]++;
					a[j + 1][1]++;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += mult(a[i][1]);
		}
		System.out.println(sum);
		sc.close();
	}

	private static int mult(int x) {
		int sum = 0;
		for (int i = 0; i < x; i++) {
			sum = sum + (int) Math.pow(2, i);
		}
		return sum;
	}
}
