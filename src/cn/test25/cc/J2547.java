package cn.test25.cc;

import java.util.Scanner;

public class J2547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			int n = (a+b) %7;
			if(n==0) System.out.println(7);
			else System.out.println(n);
		}
		sc.close();
	}
}
