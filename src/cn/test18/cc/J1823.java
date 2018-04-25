package cn.test18.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 9:16:07 AMApr 9, 2018
 *
 */
public class J1823 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m = sc.nextDouble();
		double salary = 0;
		if (n <= 40) {
			salary = 1.0 * n * m;
		} else if (n > 40 && n <= 50) {
			salary = 40.0 * m + (1.0 * n - 40) * 1.5 * m;
		} else {
			salary = 40.0 * m + 1.5 * 10 * m + 2.0 * (n - 50) * m;
		}
		System.out.format("%.2f\n", salary);
		sc.close();
	}
}
