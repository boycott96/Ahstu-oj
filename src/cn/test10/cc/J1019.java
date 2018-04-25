package cn.test10.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[0]);
		for (int i = 1; i < 4; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
		sc.close();
	}
}
