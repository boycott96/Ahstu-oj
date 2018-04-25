package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:30:29 PMApr 4, 2018
 *
 */
public class J1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			System.out.println(shift(str.toCharArray()));
		}
		sc.close();
	}

	private static String shift(char[] str) {
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < str.length; i++) {
			 sb.append(change(str[i]));
		}
		return sb.toString();
	}

	private static char change(char c) {
		if (Character.isUpperCase(c)) {
			c = (char) ((Character.toLowerCase(c) + 1 - 97) % 26 + 97);
		} else if (Character.isLowerCase(c)) {
			switch (c) {
			case 'a':
			case 'b':
			case 'c':
				c = '2';
				break;
			case 'd':
			case 'e':
			case 'f':
				c = '3';	
				break;
			case 'g':
			case 'h':
			case 'i':
				c = '4';
				break;
			case 'j':
			case 'k':
			case 'l':
				c = '5';
				break;
			case 'm':
			case 'n':
			case 'o':
				c = '6';
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				c = '7';
				break;
			case 't':
			case 'u':
			case 'v':
				c = '8';
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				c = '9';
				break;

			}
		}
		return c;
	}
}
