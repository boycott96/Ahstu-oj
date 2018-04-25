package cn.test12.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 10:55:10 PMApr 6, 2018
 *
 */
public class J1227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
