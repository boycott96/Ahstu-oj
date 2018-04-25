package cn.test10.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:16:25 AMApr 10, 2018
 *
 */
public class J1038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				System.out.print(n + "/" + 2 + "=");
				n /= 2;
				System.out.println(n);
			} else {
				System.out.print(n + "*" + 3 + "+" + 1 + "=");
				n = n * 3 + 1;
				System.out.println(n);
			}
		}
		sc.close();
	}
}
