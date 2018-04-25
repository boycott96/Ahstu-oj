package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 9:37:06 AMApr 10, 2018
 *
 */
public class J1115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int j = 1; j <= n; j++) {
			String str = String.valueOf(j);
			for (int k = 0; k < str.length(); k++) {
				int index = Integer.parseInt(String.valueOf(str.charAt(k)));
				a[index]++;
			}
		}
		for(int i =0;i<10;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
