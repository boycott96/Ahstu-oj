package cn.test11.cc;

import java.util.Scanner;

public class J1151 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		while(n-->0){
			int m = cn.nextInt();
			System.out.println(Det(m-1));
		}
	}

	private static int Det(int m) {
		if(m==1) return 1;
		if(m==2) return 2;
		return Det(m-1)+Det(m-2);
	}
}
