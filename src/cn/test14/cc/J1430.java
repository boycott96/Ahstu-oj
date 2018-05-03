package cn.test14.cc;

import java.util.Scanner;

public class J1430 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t = cn.nextInt();
		while(t-->0) {
			int n = cn.nextInt();
			int m = cn.nextInt();
			int q = cn.nextInt();
			int[] a = new int[n*m];
			for(int i = 0;i<n*m;i++) {
				a[i] = cn.nextInt();
			}
			for(int i = 0 ;i<q;i++) {
				int z = cn.nextInt();
				int count = 0;
				for(int j = 0;j<n*m;j++)
					if(a[j]>z) {
						count++;
					}
				System.out.println(count);
			}
			
		}
	}
}
