package cn.test10.cc;

import java.util.Scanner;

/**
 * 
 * @author SunnyBoy
 * @version Time��2018��3��30�� ����7:33:11
 */
public class J1043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(String.format("%.6f", subtraction(m)));
	}

	public static Double subtraction(int m) {
		double sub = 1;
		for (int i = 2; i <= m; i++) {
			sub -= 1.0 / Math.pow(i, 2);
		}
		return sub;
	}
}
