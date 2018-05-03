package cn.test12.cc;

import java.util.Scanner;

public class J1288 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int i = 1, s = 1, sum = 0;
		while (i <= n) {
			s *= i;
			s %= 1000000;
			sum += s;
			i++;
		}
		sum%= 1000000;
		System.out.println(sum);
		cn.close();
	}
}
