package cn.test13.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:45:21 AMApr 10, 2018
 *
 */
public class J1320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int m = sc.nextInt();
			System.out.println(second(m));
		}
		sc.close();
	}

	private static int second(int m) {
		if(m==0) return 1;
		return second(m-1)+2*m-2;
	}
}
