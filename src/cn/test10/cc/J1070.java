package cn.test10.cc;

import java.util.Scanner;

public class J1070 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int a = cn.nextInt();
		int n = cn.nextInt();
		int m = cn.nextInt();
		int x = cn.nextInt();
		int[] m1 = new int[n + 2];// 上车
		int[] m2 = new int[n + 2];// 下车
		int[] m3 = new int[n + 2];// 车上人数
		m1[1] = a;
		m2[1] = 0;
		m3[1] = m1[1];
		int i;
		for (i = 0;; i++) {
			m1[2] = i;
			m2[2] = i;
			m3[2] = m1[2] - m2[2];
			for (int j = 3; j < n; j++) {
				m1[j] = m1[j - 2] + m1[j - 1];
				m2[j] = m1[j - 1];
				m3[j] = m1[j] - m2[j];
			}
			int sum = 0;
			for (int k = 1; k < n; k++) {
				sum += m3[k];
			}
			if (sum == m)
				break;
		}
		int su = 0;
		for (int l = 1; l <= x; l++) {
			su += m3[l];
		}
		System.out.println(su);
		cn.close();
	}
}
