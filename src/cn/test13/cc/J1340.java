package cn.test13.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1340 {
	static int N;
	static int[] a;
	static boolean[] b;
	static int count = 0;
	static int value = 0;
	static boolean flag = false;
	static StringBuffer str = new StringBuffer();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] as = new int[n];
		N = n;
		StringBuffer ss = new StringBuffer();
		for (int i = 0; i < n; i++) {
			as[i] = sc.nextInt();
			ss.append(as[i]);
		}
		Arrays.sort(as);
		dfs(0, as, ss.toString());
		System.out.println(value);
		print(str.toString());
		sc.close();
	}

	private static void print(String s) {
		System.out.print(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			System.out.print(" " + s.charAt(i));
		}
		System.out.println();
	}

	static void dfs(int k, int[] as, String s) {
		if (k == N) {
			count++;
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < N; i++) {
				sb.append(a[i]);
			}

			if (sb.toString().equals(s)) {
				value = count;
				flag = true;
			}
			if (flag) {
				str = sb;
				flag = false;
			}
			return;
		}
		for (int i = 0; i < N; i++) {
			if (b[i] == false) {
				b[i] = true;
				a[k] = as[i];
				dfs(k + 1, as, s);
				b[i] = false;
			}
		}
	}
}
