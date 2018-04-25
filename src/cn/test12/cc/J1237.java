package cn.test12.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @data 2018Äê4ÔÂ14ÈÕ
 */
public class J1237 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			double n = sc.nextDouble();
			double result = n*Math.log10(n);
			result %= 1.0;
			result = Math.pow(10.0, result);
			System.out.println((int)result);
		}
		sc.close();
	}
}
