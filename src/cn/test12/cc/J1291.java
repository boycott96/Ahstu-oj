package cn.test12.cc;

import java.util.Scanner;
/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月30日 下午11:28:55
 */
public class J1291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b>=1000) b = 999;
		for (int i = a; i <= b; i++) {
			int a1 = i % 10;
			int a2 = i / 10 % 10;
			int a3 = i / 100;
			if (i == a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3)
				System.out.println(i);
		}
	}
}
