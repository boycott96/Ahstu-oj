package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 2:47:46 PMApr 10, 2018
 *
 */
public class J1545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int sum = 0;
			while(n>0) {
				sum+=n%10;
				n/=10;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
