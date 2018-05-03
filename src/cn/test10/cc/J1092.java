package cn.test10.cc;

import java.util.Scanner;

public class J1092 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int m = cn.nextInt();
		while(m-->0){
			int n = cn.nextInt();
			int counts = 0;
			while(resert(n)!=n){
				n += resert(n);
				counts++;
				if(counts>8) break;
			}
			if(counts<=8) System.out.println(counts);
			else System.out.println(0);
		}
		cn.close();
	}
	public static int resert(int n){
		int a = 0;
		while(n>0){
			a = a*10+ n%10;
			n/=10;
		}
		return a;
	}
}
