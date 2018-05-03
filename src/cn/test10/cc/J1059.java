package cn.test10.cc;

import java.util.Scanner;
//todo
public class J1059 {
	private static int[] a;

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		a = new int[3001];
		a[0] = cn.nextInt();
		a[n + 1] = cn.nextInt();
		int[] c = new int[3001];
		for (int i = 0; i < n; i++) {
			c[i] = cn.nextInt();
		}
		int t = Det(a[n + 1], n + 1, c);
		cn.close();
	}

	private static int Det(int j,int z, int[] c) {
		if(z==0) return a[0];
		else{
			a[z-1] = (a[z-2]+j)/2-c[z-2];
			return Det(a[z-1],z-1,c);
		}
	}
}
