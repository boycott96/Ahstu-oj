package cn.test10.cc;

import java.util.Scanner;

public class J1099 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		while (n-- > 0) {
			String str = cn.next();
			char[] c = str.toCharArray();
			int counts = 0;
			if (c[0] - 2 >= 'a' && c[1] - '1' >= 1) { 
				counts++;
			}
			if (c[0] - 2 >= 'a' && '8' - c[1] >= 1) {
				counts++;
			}
			if (c[1] - 2 >= 49 && c[0] - 1 >= 'a') {
				counts++;
			}
			if (c[1] - 2 >= 49 && 'h' - c[0] >= 1) {
				counts++;
			}
			if ('8' - c[1] >= 2 && c[0] - 1 >= 97) {
				counts++;
			}
			if ('8' - c[1] >= 2 && 'h' - c[0] >= 1) {
				counts++;
			}
			if ('h' - c[0] >= 2 && c[1] - 1 >= 49) {
				counts++;
			}
			if ('h' - c[0] >= 2 && '8' - c[1] >= 1) {
				counts++;
			}
			System.out.println(counts);

		}
		cn.close();
	}
}
