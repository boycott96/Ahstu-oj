package cn.test13.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 12:44:06 PMApr 6, 2018
 *
 */
public class J1307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = Integer.MIN_VALUE, x = -1, y = -1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int n = sc.nextInt();
				if (n > f) {
					f = n;
					x = i;
					y = j;
				}
			}
		}
		System.out.println(f + " " + x + " " + y);
		sc.close();
	}
}
