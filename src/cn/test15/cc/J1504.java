package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 3:20:51 PMApr 10, 2018
 *
 */
public class J1504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int s3 = sc.nextInt();
			if(s1+s2>=s3) {
				System.out.println(s1+s2-s3);
			}else {
				System.out.println("Impossible");
			}
		}
		sc.close();
	}
}
