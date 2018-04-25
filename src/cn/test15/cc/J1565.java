package cn.test15.cc;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 10:58:08 PMApr 10, 2018
 *
 */
public class J1565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			a += x;
			b += y;
			c += z;
			if (c >= 60) {
				c = c % 60;
				b++;
			}
			if (b >= 60) {
				b = b % 60;
				a++;
			}
			if (a >= 24) {
				a = a % 24;
			}
			DecimalFormat df = new DecimalFormat("00");
			String stra = df.format(a);
			String strb = df.format(b);
			String strc = df.format(c);
			System.out.println(stra+":"+strb+":"+strc);
		}
		sc.close();
	}
}
