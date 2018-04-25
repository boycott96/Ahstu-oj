package cn.test14.cc;

import java.util.Scanner;

public class J1451 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int k = n,count = 0;
			while(k>0) {
				count+=k%10;
				k/=10;
			}
			if(n%count==0) System.out.println("yes");
			else System.out.println("no");
		}
		sc.close();
	}
}
