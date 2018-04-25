package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 2:46:15 AMApr 4, 2018
 *
 */
public class J1506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			System.out.println(calcCircle(str));
		}
		sc.close();
	}

	private static int calcCircle(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '0':
				count++;
				break;
			case '6':
				count++;
				break;
			case '8':
				count += 2;
				break;
			case '9':
				count++;
				break;
			default:
				break;
			}
		}
		return count;
	}
}
