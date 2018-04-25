package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 10:40:33 PMApr 10, 2018
 *
 */
public class J1146 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (sc.hasNext()) {
			int x = sc.nextInt();
			if (x == 0)
				break;
			if (F(x))
				count++;
		}
		sc.close();
		System.out.println(count);
	}

	private static boolean F(int n) {
		int k = 0;
		for (int i = 1; (k = i * i * i) <= n; i++) {
			if (k == n)
				return true;
		}
		return false;
	}
}
