package cn.test10.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class J1008 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int k = cn.nextInt();
			int z = n/2;
			BigInteger k1 = new BigInteger(Integer.toString(k));
			BigInteger k2= new BigInteger(Integer.toString(k-1));
			BigInteger s1 = new BigInteger("1");
			BigInteger s2 = new BigInteger("1");
			
			for(int i=0;i<z;i++){
				s1=s1.multiply(k1);
			}
			for(int i = 0 ;i<n-z;i++){
				s2=s2.multiply(k2);
			}
			System.out.println(s1.multiply(s2));
		}
		cn.close();
	}
}
