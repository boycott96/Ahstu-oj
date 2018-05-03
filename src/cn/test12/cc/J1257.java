package cn.test12.cc;

import java.math.BigInteger;
import java.util.Scanner;

public class J1257 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String a = cn.nextLine();
		String b = cn.nextLine();
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		int A = a1[a1.length-1]-'0';
		int B = b1[b1.length-1]-'0';
		int c = cn.nextInt();
		int d = (A+B)%10;
		if(c==d) System.out.println("YES");
		else System.out.println("NO");
		
	}
}
