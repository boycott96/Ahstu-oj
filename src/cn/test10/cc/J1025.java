package cn.test10.cc;

import java.text.NumberFormat;
import java.util.Scanner;

public class J1025 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(n);
		System.out.println(nf.format(Math.PI));
		cn.close();
	}
}
