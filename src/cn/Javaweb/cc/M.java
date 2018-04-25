package cn.Javaweb.cc;

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(isflag(n));
		}
		sc.close();
	}

	private static int isflag(int n) {
		if(n==1) return 1;
		int i=2;
		while(4*(i-1)<n) {
			i++;
		}
		if(4*(i-1)==n) return i;
		return -1;
	}
}
