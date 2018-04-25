package cn.test10.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 12:31:50 PMApr 6, 2018
 *
 */
public class J1033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0,i=1;
		while(sum<=n) {
			sum+=Math.pow(i, 3);
			i++;
		}
		System.out.println(i-2);
		sc.close();
	}
}
