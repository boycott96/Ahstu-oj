package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:41:21 AMApr 10, 2018
 *
 */
public class J1560 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String newstr = str;
			int m = sum(newstr);
			while(m>10) {
				newstr = String.valueOf(sum(newstr));
				m=sum(newstr);
			}
			System.out.println(m);
		}
		sc.close();
	}
	private static int sum(String str) {
		int count =0;
		for(int i =0;i<str.length();i++) {
			count+=Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return count;
	}
}
