package cn.test11.cc;

import java.util.Scanner;

public class J1143 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			String string = cn.next();
			if(string.endsWith("END")) break;
			char[] ch = string.toCharArray();
			for (int i = 0; i < string.length(); i++) {
				switch (ch[i]) {
				case 'A':
				case 'W':
				case 'F':
					ch[i] = 'I';
					break;
				case 'C':
					ch[i] = 'L';
					break;
				case 'M':
					ch[i] = 'o';
					break;
				case 'S':
					ch[i] = 'v';
					break;
				case 'D':
				case 'P':
				case 'G':
				case 'B':
					ch[i] = 'e';
					break;
				case 'L':
					ch[i] = 'Y';
					break;
				case 'X':
					ch[i] = 'u';
					break;
				default:
					break;
				}
			}
			System.out.println(ch);
		}
	}
}
