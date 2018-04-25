package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 12:09:59 PMApr 8, 2018
 *
 */
public class J1554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			if(a.compareTo(b)==0) {
				System.out.println(a+" "+b);
			}else {
				System.out.println(Math.max(a, b));
			}
		}
		sc.close();
		
	}
}
