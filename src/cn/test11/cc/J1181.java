package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:21:58 AMApr 10, 2018
 *
 */
public class J1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] a = new int[20];
		a[0]=1;
		a[1]=1;
		for(int i = 2;i<20;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		while(m-->0) {
			int n = sc.nextInt();
			System.out.println(a[n-1]);
		}
		sc.close();
	}
}
