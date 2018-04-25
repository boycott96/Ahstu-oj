package cn.test18.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:02:42 PMApr 6, 2018
 *
 */
public class J1808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] newstr = str.split(" ");
		int maxLength = 0;
		String restr = "";
		for (String i : newstr) {
			if (maxLength < i.length()) {
				maxLength = i.length();
				restr = i;
			}
		}
		System.out.println(restr);
		sc.close();
	}
}
