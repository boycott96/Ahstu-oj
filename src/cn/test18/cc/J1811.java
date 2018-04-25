package cn.test18.cc;

import java.util.Scanner;

public class J1811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 100 || n > 999) {
			System.out.println("NO");
		} else {
			int a = n % 10;
			int b = n / 10 % 10;
			int c = n / 100;
			if (n == a * a * a + b * b * b + c * c * c)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
