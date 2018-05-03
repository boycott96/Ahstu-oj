package cn.test10.cc;

import java.util.Scanner;

public class J1009 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int s = cn.nextInt();
			System.out.println(maths(s));
		}
		cn.close();
	}

	private static int maths(int s) {
		int sum = 0;
		while(s!=0){
			sum+=s%10;
			s/=10;
		}
		return sum;
	}
}
