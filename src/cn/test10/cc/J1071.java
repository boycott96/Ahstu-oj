package cn.test10.cc;

import java.util.Scanner;

public class J1071 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		while(n-->0){
			int m = cn.nextInt();
			int sum = 3;
			for(int i =0;i<m;i++){
				sum = (sum-1)*2;
			}
			System.out.println(sum);
		}
		cn.close();
	}
}
