package cn.test20.cc;

import java.util.Scanner;

public class J2045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			if(a==0&&b==0&&c==0&&d==0&&e==0) break;
			if(b-a==c-b) {
				int delta = b-a;
				for(int i =0;i<5;i++) {
					System.out.print((e+=delta)+" ");
				}
			}else if(b/a==c/b){
				int q = b/a;
				for(int i =0;i<5;i++) {
					System.out.print((e*=q)+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
