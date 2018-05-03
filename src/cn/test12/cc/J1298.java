package cn.test12.cc;

import java.math.BigDecimal;
import java.util.Scanner;

public class J1298 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int a1 = cn.nextInt();
			int b1 = cn.nextInt();
			int c = cn.nextInt();
			BigDecimal a = new BigDecimal(a1);
			BigDecimal b = new BigDecimal(b1);
			BigDecimal d = a.divide(b, c, java.math.RoundingMode.HALF_UP);
			System.out.println(d);
		}
	}
}
