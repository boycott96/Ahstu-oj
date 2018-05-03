package cn.test10.cc;

import java.math.BigInteger;

public class J1037 {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger(Integer.toString(0));
		for(int i=0;i<64;i++){
			sum=sum.add(fi(i));
		}
		System.out.println(sum);
	}

	private static BigInteger fi(int i) {
		BigInteger s = new BigInteger(Integer.toString(1));
		for(int j=0;j<i;j++){
			s=s.multiply(new BigInteger(Integer.toString(2)));
		}
		return s;
	}
}
