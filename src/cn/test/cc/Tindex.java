package cn.test.cc;

import java.util.Scanner;

public class Tindex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int result = 0;
		int i = 0;
		for (char ch : str.toCharArray()) {
			int intch = ch - 'a';
			int b = 0;
			while (b < 4 - i) {
				result += intch * Math.pow(25, b++);
			}
			i++;
			result++;
		}
		System.out.println(result - 1);
		sc.close();
	}
}