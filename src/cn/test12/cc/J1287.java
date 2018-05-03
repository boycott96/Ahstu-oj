package cn.test12.cc;

import java.util.Scanner;

public class J1287 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			int count = 0;
			while (n > 1) {
				if (n % 2 != 0)
					n = 3 * n + 1;
				else
					n /= 2;
				count++;
			}
			System.out.println(count);
		}

	}
}
