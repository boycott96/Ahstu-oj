package cn.test10.cc;

import java.util.Scanner;

public class J1029 {
	public static void main(String[] args) {
		Scanner cn =  new Scanner(System.in);
		int[][] cc = new int[10][10];
		
		while(cn.hasNext()){
			int n = cn .nextInt();
			int sum = 0;
			for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++){
				cc[i][j]=cn.nextInt();
			}
			for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++){
				if(i==j||i+j==n+1){
					sum+=cc[i][j];
				}
			}
			System.out.println(sum);
		}
		cn.close();
	}
}
