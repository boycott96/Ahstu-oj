package cn.test18.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 12:01:17 PMApr 11, 2018
 *
 */
public class J1856 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			double l = 1.0 / 2 * (a + b + c);
			double s = Math.sqrt(l * (l - a) * (l - b) * (l - c));
			double r = 2.0 * s / (a + b + c);
			double R = 1.0 * a * b * c / (4 * s);
			System.out.format("%.3f %.3f\n", Math.PI * r * r, Math.PI * R * R);
		}
		sc.close();
	}
}
