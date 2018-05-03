package cn.test12.cc;

import java.util.Scanner;

public class J1253 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int a = cn.nextInt();
			int b = cn.nextInt();
			int max = 0;
			System.out.print(a+" "+b+" ");
			for (int i = a; i <= b; i++) {
				int n = i, sum = 1;
				while (n !=1) {
					if (n % 2 != 0)
						n = 3 * n + 1;
					else
						n = n / 2;
					sum++;
				}
				if (max < sum)
					max = sum;
			}
			System.out.println(max);
		}
	}
}
