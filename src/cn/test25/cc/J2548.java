package cn.test25.cc;

import java.util.Scanner;

public class J2548 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			int sum = 0;
			if (a < 1000)
				a = 1000;
			if (b > 9999)
				b = 9999;
			for (int i = a; i <= b; i++) {
				if (fortunatly(i))
					sum++;
			}
			System.out.println(sum);
		}
		sc.close();
	}

	private static boolean fortunatly(int i) {
		int a1 = i % 10;
		int a2 = i / 10 % 10;
		int a3 = i / 100 % 10;
		int a4 = i / 1000;
		if (Math.pow(a1, 4) + Math.pow(a2, 4) + Math.pow(a3, 4) + Math.pow(a4, 4) == i)
			return true;
		return false;
	}
}
