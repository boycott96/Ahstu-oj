package cn.test10.cc;

import java.util.Scanner;

public class J1048 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int M = cn.nextInt();
		while(M--!=0){
			int a = cn.nextInt();
			int b = cn.nextInt();
			int sa=0;
			int sb=0;
			for(int i=1;i<a;i++){
				if(a%i==0){
					sa+=i;
				}
			}
			for(int i=1;i<b;i++){
				if(b%i==0){
					sb+=i;
				}
			}
			if(sa==b&&sb==a){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		cn.close();
	}
}
