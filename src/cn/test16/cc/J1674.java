package cn.test16.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1674 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[n-1]);
		for(int i = n-2;i>=n-10;i--) {
			System.out.print(" "+a[i]);
		}
		sc.close();
	}
}
