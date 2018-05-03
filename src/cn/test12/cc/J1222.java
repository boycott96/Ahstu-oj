package cn.test12.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1222 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			int t = cn.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = cn.nextInt();
			Arrays.sort(a);
			if (t == 0)
				for (int i = 0; i < n; i++)
					System.out.println(a[i]);
			else
				for (int i = n - 1; i >= 0; i--)
					System.out.println(a[i]);
		}
	}
}
