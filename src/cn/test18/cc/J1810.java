package cn.test18.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:26:22 PMApr 10, 2018
 *
 */
public class J1810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(str1.compareTo(str2));
		}
		sc.close();
	}
}
