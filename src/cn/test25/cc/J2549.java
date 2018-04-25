package cn.test25.cc;

import java.util.Scanner;

public class J2549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			String str = sc.next();
			boolean flag = false;
			for(int i =1;i<str.length();i++) {
				if(str.charAt(i)!=str.charAt(0)) flag = true;
			}
			if(flag) System.out.println("N");
			else System.out.println("Y");
		}
		sc.close();
	}
}
