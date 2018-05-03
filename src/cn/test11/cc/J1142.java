package cn.test11.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class J1142 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int m = cn.nextInt();
			int n = cn.nextInt();
			BigInteger sum = fictorial(m).divide(fictorial(n).multiply(fictorial(m-n)));
			System.out.println(sum);
		}
	}
	public static BigInteger fictorial(int n){
		return n<=1? new BigInteger(Integer.toString(1)):fictorial(n-1).multiply(new BigInteger(Integer.toString(n)));
	}
}
