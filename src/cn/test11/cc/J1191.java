package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:15:25 PMApr 6, 2018
 *
 */
public class J1191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int z = (int) Math.pow(n, 1.0 / 3);
			if (z * z * z == n)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
