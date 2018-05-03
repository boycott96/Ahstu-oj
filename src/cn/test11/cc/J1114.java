package cn.test11.cc;

import java.util.Scanner;

public class J1114 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		System.out.println(Det(n));
	}

	private static int Det(int n) {
		if (n == 3)
			return 5;
		if (n == 2)
			return 4;
		if (n <= 1)
			return 3;
		return Det(n-1)+Det(n-2)+Det(n-3);
	}
}
