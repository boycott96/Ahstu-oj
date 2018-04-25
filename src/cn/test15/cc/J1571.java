package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 7:51:54 PMApr 4, 2018
 *
 */
public class J1571 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int m = sc.nextInt();
			int sum = 0;
			for(int i = 1;i<=m;i++) {
				sum+=summer(i);
			}
			System.out.println(sum);
		}
		sc.close();
	}

	private static int summer(int i) {
		if(i<1) return 0; 
		return i+summer(i-1);
	}
}
