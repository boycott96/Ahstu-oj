package cn.test10.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1052 {
	static int[] a = new int[10000];
	static int[] b = new int[10000];
	static int[] s = new int[10001];

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		String m = cn.next();
		int l = m.length();
		int count = 0;
		for (int i = 0; i < l; i++) {
			if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z') {
				a[i] = m.charAt(i) - 'A' + 10;
			} else {
				a[i] = m.charAt(i) - '0';
			}
			s[i] = a[i];
			b[l - i - 1] = a[i];
		}
		while (!huiwen(s, l) && count <= 30) {
			count++;
			Arrays.fill(s, 0);
			for (int i = 0; i < l; i++) {
				s[i] += a[i] + b[i];
				s[i + 1] += s[i] / n;
				s[i] = s[i] % n;
			}
			if (s[l] != 0)
				l = l + 1;
			inverse(s, l);
		}
		if (count <= 30) {
			System.out.println("STEP=" + count);
		} else {
			System.out.println("Impossible!");
		}
		cn.close();
	}

	private static void inverse(int[] s2, int l) {
		int i;
		Arrays.fill(a, 0);
		Arrays.fill(b, 0);
		for (i = 0; i < l; i++) {
			a[i] = s[i];
			b[l - i - 1] = a[i];
		}

	}

	private static boolean huiwen(int[] s2, int l) {
		int k = (l - 1) / 2;
		int i;
		for (i = 0; i <= k; i++) {
			if (s[i] != s[l - i - 1])
				break;

		}
		if (i == k + 1)
			return true;
		else
			return false;
	}
}
