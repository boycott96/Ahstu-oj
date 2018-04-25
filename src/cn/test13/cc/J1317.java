package cn.test13.cc;

import java.util.Scanner;

public class J1317 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int m = cn.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = cn.nextInt();
			b[i] = cn.nextInt();
		}
		int t = m;
		for(int i = 0;i<m;i++){
			for(int j = 0;j<m;j++){
				if(a[i] == b[j]) t--;
			}
		}
		System.out.println(t);
		cn.close();
	}
}
