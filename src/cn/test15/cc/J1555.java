package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:42:59 PMApr 4, 2018
 *
 */
public class J1555 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(fFactorial(n));
		}
		sc.close();
	}
	private static int fFactorial(int n) {
		if(n<=1) return 1;
		return n*fFactorial(n-2);
	}
}
