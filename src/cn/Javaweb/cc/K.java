package cn.Javaweb.cc;

import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int mass = sc.nextInt();
			char[][] a = new char[n][m];
			while (mass-- > 0) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				a[x][y] = '*';
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int count = 0;
					if (a[i][j] != '*') {
						if (i == 0) {
							if (j == 0) {
								if (a[i][j+1]=='*') count++;
								if(a[i+1][j]=='*') count++;
								if(a[i+1][j+1]=='*') count++;
							}
							else if(j!=m-1){
								if(a[i][j-1]=='*') count++;
								if(a[i+1][j-1]=='*') count++;
								if(a[i+1][j]=='*') count++;
								if(a[i+1][j+1]=='*') count++;
								if(a[i][j+1]=='*') count++;
							}
							else {
								if (a[i][j-1]=='*') count++;
								if(a[i+1][j-1]=='*') count++;
								if(a[i+1][j]=='*') count++;
							}
						}else if(i!=n-1){
							if(j==0) {
								if(a[i-1][j]=='*') count++;
								if(a[i-1][j+1]=='*') count++;
								if(a[i][j+1]=='*') count++;
								if(a[i+1][j]=='*') count++;
								if(a[i+1][j+1]=='*') count++;
							}
							else if(j!=m-1) {
								if(a[i-1][j-1]=='*') count++;
								if(a[i-1][j]=='*') count++;
								if(a[i-1][j+1]=='*') count++;
								if(a[i][j-1]=='*') count++;
								if(a[i][j+1]=='*') count++;
								if(a[i+1][j-1]=='*') count++;
								if(a[i+1][j]=='*') count++;
								if(a[i+1][j+1]=='*') count++;
								
							}
							else {
								if(a[i-1][j]=='*') count++;
								if(a[i-1][j-1]=='*') count++;
								if(a[i][j-1]=='*') count++;
								if(a[i+1][j-1]=='*') count++;
								if(a[i+1][j]=='*') count++;
								
								
							}
						}
						else {
							if(j==0) {
								if(a[i-1][j]=='*') count++;
								if(a[i-1][j+1]=='*') count++;
								if(a[i][j+1]=='*') count++;
							}else if(j!=m-1) {
								if(a[i][j-1]=='*') count++;
								if(a[i-1][j-1]=='*') count++;
								if(a[i-1][j]=='*') count++;
								if(a[i-1][j+1]=='*') count++;
								if(a[i][j+1]=='*') count++;
							}else {
								if(a[i-1][j]=='*') count++;
								if(a[i-1][j-1]=='*') count++;
								if(a[i][j-1]=='*') count++;
							}
						}
						a[i][j] = (char) (count+'0');
					}
				}
			}
			for(int i =0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}
