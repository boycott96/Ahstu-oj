package cn.test15.cc;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 12:58:41 PMApr 6, 2018
 *
 */
public class J1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String a = sc.next();
			String b = sc.next();
			System.out.println(new BigInteger(a).add(new BigInteger(b)));
		}
		sc.close();
	}
}
