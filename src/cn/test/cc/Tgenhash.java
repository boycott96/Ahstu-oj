package cn.test.cc;

import java.util.Scanner;

public class Tgenhash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 6;
		int a = -90;
		int b = 90;
		while (i-- > 0) {
			int c = (a + b) / 2;
			if(n>=c) {
				System.out.print(1);
				a = c;
			}
			else {
				System.out.print(0);
				b = c;
			}
		}
		System.out.println();
		sc.close();
	}
}
