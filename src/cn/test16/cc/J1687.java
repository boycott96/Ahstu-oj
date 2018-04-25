package cn.test16.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:25:00 PMApr 10, 2018
 *
 */
public class J1687 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			if (str1.compareTo(str2) > 0)
				System.out.println(1);
			else if (str1.compareTo(str2) < 0)
				System.out.println(-1);
			else
				System.out.println(0);
		}
		sc.close();
	}
}
