package cn.test15.cc;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:31:06 PMApr 10, 2018
 *
 */
public class J1502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			BigInteger sn = new BigInteger(Integer.toString(0));
			for (int i = 1; i <= m; i++) {
				sn = sn.add(S(n,i));
			}
			System.out.println(sn);
		}
		sc.close();
	}

	private static BigInteger S(int n, int m) {
		StringBuffer str = new StringBuffer();
		while (m-- >0) {
			str.append(Integer.toString(n));
		}
		return new BigInteger(str.toString());
	}
}
