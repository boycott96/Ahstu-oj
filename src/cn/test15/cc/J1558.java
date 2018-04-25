package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:55:12 AMApr 10, 2018
 *
 */
public class J1558 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			double s = 100.0*n/m;
			System.out.format("%.2f",s);
			System.out.println("%");
		}
		sc.close();
	}
}
