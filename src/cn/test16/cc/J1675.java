package cn.test16.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:20:03 PMApr 10, 2018
 *
 */
public class J1675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int a = 0;a<=1000;a++) {
			for(int b = a+1;b<=1000-a;b++) {
				for(int c = b+1;c<=1000-a-b;c++) {
					if(c*c==a*a+b*b) {
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
		sc.close();
	}
}
