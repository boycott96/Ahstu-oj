package cn.test11.cc;

import java.util.Scanner;

public class J1116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for(int i =7;i<=n;i++) {
			if(i%7==0) {
				count++;
			}
			else {
				String str = Integer.toString(i);
				if(str.contains("7")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
