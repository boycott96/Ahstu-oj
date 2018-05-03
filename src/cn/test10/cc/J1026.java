package cn.test10.cc;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月30日 下午11:03:51
 */
public class J1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		BigInteger sum = new BigInteger(Integer.toString(0));
		for(int i =1;i<=n;i++) {
			sum = sum.add(compound(i,a));
		}
		System.out.println(sum);
		sc.close();
	}

	private static BigInteger compound(int i, int a) {
		String str = "";
		while(i-->0) {
			str+=Integer.toString(a);
		}
		return new BigInteger(str);
	}
}
