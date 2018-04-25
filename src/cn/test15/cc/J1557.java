package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 9:02:32 AMApr 9, 2018
 *
 */
public class J1557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			String str = sc.next();
			System.out.println(str.charAt(0));
		}
		sc.close();
	}
}
