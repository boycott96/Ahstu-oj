package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:12:53 PMApr 10, 2018
 *
 */
public class J1544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[30];
		a[0] = 1;
		a[1] = 1;
		for(int i =2;i<30;i++) {
			a[i] = a[i-1]+a[i-2];
		}
		while(n-->0) {
			int m = sc.nextInt();
			int sum =0;
			for(int i =0;i<m;i++) {
				sum+=a[i];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
