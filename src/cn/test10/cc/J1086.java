package cn.test10.cc;

import java.util.Scanner;

public class J1086 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			String s = cn.nextLine();
			int m = s.indexOf("/");
			if (m == 0) {
			} else if (m > 0) {
				for (int i = 0; i < m; i++) {
					System.out.print(s.charAt(i));
				}
				System.out.println();
			} else if (m < 0) {
				System.out.println(s);
			}
		}
		cn.close();
	}
}
