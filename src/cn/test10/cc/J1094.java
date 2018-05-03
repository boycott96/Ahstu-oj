package cn.test10.cc;

import java.util.Scanner;

public class J1094 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t= cn.nextInt();
		while(t-->0){
			double n = cn.nextDouble();
			double area = Math.pow(n, 2)*Math.PI;
			System.out.printf("%.6f\n",area);
		}
		cn.close();
	}
}
