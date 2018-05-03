package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1121 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = cn.nextInt();
		}
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (num[j] < 0)
					continue;
				else {
					if (num[i] == num[j])
						num[j] = -1;
				}
			}
		}
		Arrays.sort(num);
		int i = 0;
		while (num[i] < 0) {
			i++;
		}
		System.out.println(n-i);
		System.out.print(num[i]);
		for (int j = i+1; j < n; j++) {
			if (num[j] > 0) {
				System.out.print(" " + num[j]);
			}
		}

	}
}
