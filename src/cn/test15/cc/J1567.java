package cn.test15.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 11:28:23 PMApr 6, 2018
 *
 */
public class J1567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			double weight = (n * 1.0 - 100) * 0.9 * 2;
			System.out.format("%.1f\n", weight);
		}
		sc.close();
	}
}
