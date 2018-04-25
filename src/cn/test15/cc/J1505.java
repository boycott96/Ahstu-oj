package cn.test15.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 1:19:18 PMApr 6, 2018
 *
 */
public class J1505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			String str = sc.next();
			int b = Integer.parseInt(new StringBuffer(str).reverse().toString());
			System.out.println(a + b);

		}
		sc.close();
	}
}
