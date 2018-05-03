package cn.test10.cc;

import java.util.Arrays;
import java.util.Scanner;
//todo


public class J1058 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = cn.nextInt();
				}
			}
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				int min = a[i][0];
				int max = a[i][0];
				for (int j = 0; j < n; j++) {
					if (a[i][j] < min) {
						min = a[i][j];
					}
					if (a[i][j] > max) {
						max = a[i][j];
					}
				}
				b[i] = min;
				c[i] = max;
			}

			int[] x = new int[n];
			Arrays.fill(x, 0);
			for (int i = 0; i < n; i++) {
				x[i]+=b[i];
				for (int j = 0; j < n; j++) {
					if(i!=j){
						x[i] += c[j];
					}
				}
			}
			for(int i =0;i<n;i++){
				System.out.print(x[i]+" ");
			}
		}
		cn.close();
	}
}
