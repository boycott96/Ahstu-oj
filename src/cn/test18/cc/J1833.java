package cn.test18.cc;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:06:13 PMApr 10, 2018
 *
 */
public class J1833 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = factorial(n).toString();
		for(int i =str.length()-1;i>=0;i--) {
			if(str.charAt(i)!='0') {
				System.out.println(str.charAt(i));
				break;
			}
		}
		sc.close();
	}

	private static BigInteger factorial(int n) {
		if(n<=1) return new BigInteger(Integer.toString(1));
		return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
	}
}
