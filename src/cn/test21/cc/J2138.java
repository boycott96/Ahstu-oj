package cn.test21.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 2:03:22 PMApr 10, 2018
 *
 */
public class J2138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] a = {0,0,0,0};
		for(int i =0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) a[0]++;
			else if(Character.isLowerCase(str.charAt(i))) a[1]++;
			else if(Character.isDigit(str.charAt(i))) a[2]++;
			else if(str.charAt(i)==' ') a[3]++;
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		sc.close();
	}
}
