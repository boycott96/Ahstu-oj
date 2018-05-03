package cn.test10.cc;

import java.util.Scanner;

public class J1065 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			Det(n);

		}
		cn.close();
	}

	private static void Det(int n) {
		if (n < 2)
			System.out.println(0);
		else if (n == 2) {
			System.out.println(0 + " " + 1);
		} else if (n > 2) {
			System.out.print(0);
			int s = n - 1;
			int su = n * s / 2;
			int z = (s - 1) * 2;
			if (z != s)
				System.out.print(" " + s);
			for (int i = z; i <= su; i++) {
				System.out.print(" " + z++);
			}
			System.out.println();
		}

	}
}
