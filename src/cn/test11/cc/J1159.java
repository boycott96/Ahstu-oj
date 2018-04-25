package cn.test11.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 1:10:07 PMApr 6, 2018
 *
 */
public class J1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			double sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				double m = sc.nextDouble();
				sum += m;
				if (min > m)
					min = m;
				if (max < m)
					max = m;
			}
			System.out.format("%.2f\n", (sum - min - max) / (n-2));
		}
		sc.close();
	}
}
