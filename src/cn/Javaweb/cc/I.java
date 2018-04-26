package cn.Javaweb.cc;

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] t = new int[11];
		int[] conins = new int[11];
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i = 0;i<n;i++) {
				t[i] = sc.nextInt();
				conins[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			//int num =0;
			int[] d = new int[21010];
			for(int i = 1;i<=m;i++) d[i] = 65536;
			for(int i = 0;i<n;i++) {
				for(int j =1;j<=conins[i];j++) {
					for(int k = m;k>=t[i];k--) {
						System.out.println(d[k]+" " + d[k-t[i]]);
						d[k] = Math.min(d[k],d[k-t[i]]+1);
					}
					for(int o = 0;o<m;o++) {
						System.out.print(d[o]+" ");
					}
					System.out.println();
					System.out.println("-----------------");
				}
			}
			//System.out.println(d[m]);
		}
		sc.close();
	}
}
