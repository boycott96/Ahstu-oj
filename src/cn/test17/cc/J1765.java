package cn.test17.cc;

import java.util.Scanner;

/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月30日 下午10:46:57
 */
public class J1765 {
	private static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Hanoi(n, m, 'a', 'b', 'c');
		System.out.println(sum);
		sc.close();
	}

	private static void Hanoi(int n, int m, char a, char b, char c) {
		if (n <= m)
			sum++;
		else {
			Hanoi(n - m, m, a, c, b);
			sum++;
			Hanoi(n - m, m, b, a, c);
		}
	}
}
