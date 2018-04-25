package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0&&m==0) break;
			int a[] = new int[n+1];
			for(int i =0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			a[n] = m;
			Arrays.sort(a);
			System.out.print(a[0]);
			for(int i=1;i<=n;i++) {
				System.out.print(" "+a[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}
