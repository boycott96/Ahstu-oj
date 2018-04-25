package cn.test10.cc;

import java.math.BigInteger;
/**
 * 
 * @author Huai
 * @creation 7:56:44 PMApr 4, 2018
 *
 */
public class J1039 {
	public static void main(String[] args) {
		int n = 1977;
		System.out.println(factorial(n));
		
	}

	private static BigInteger factorial(int n) {
		if(n<1) return new BigInteger(Integer.toString(1));
		return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
	}
}
