package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:27:26 PMApr 6, 2018
 *
 */
public class J1575 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.printf("%X\n",Integer.parseInt(str1, 16)+Integer.parseInt(str2, 16));
			
		}
		sc.close();
	}
}
