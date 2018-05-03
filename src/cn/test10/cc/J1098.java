package cn.test10.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class J1098 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		String str = cn.next();
		char[] c = str.toCharArray();
		BigInteger answer = factorial(n);
		int b =1;
		for(int i =1;i<n;i++){
			if(c[i-1]==c[i]){
				b++;
			}
			else{
				answer = answer.divide(new BigInteger(Integer.toString(b)));
				b=1;
			}
		}
		answer = answer.divide(new BigInteger(Integer.toString(b)));
		System.out.println(answer);
		cn.close();
	}
	public static BigInteger factorial(int n){
		return n<=1? new BigInteger(Integer.toString(1)):new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
	}
	
}
