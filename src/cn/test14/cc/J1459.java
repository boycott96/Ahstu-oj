package cn.test14.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:50:57 AMApr 10, 2018
 *
 */
public class J1459 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int y = (4 * n - m) / 2;
			int x = n - y;
			System.out.println(x + " " + y);
		}
		sc.close();
	}
}
