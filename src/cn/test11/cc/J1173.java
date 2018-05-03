package cn.test11.cc;

import java.util.Scanner;

public class J1173 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		double sum = 0,i = 0;
		while (sum <= n) {
			sum =  Math.pow(2, i);
			i++;
		}
		double a =  Math.pow(2, i - 1);
		double b =  Math.pow(2, i - 2);
		if (a - n < n - b)
			System.out.println((long)a);
		else
			System.out.println((long)b);
	}
}
