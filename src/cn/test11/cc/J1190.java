package cn.test11.cc;

import java.util.Scanner;

public class J1190 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int m = cn.nextInt();
			if(n==0&&m==0) break;
			int x,y,counts =0 ;
			int[] z = new int[n];
			for(int i =0;i<n;i++){
				z[i] = i+1;
			}
			int t =0;
			while(m-->0){
				int a = cn.nextInt();
				int b = cn.nextInt();
				if(a==1||b==1) t++;
				z[a-1] = 0;
				z[b-1] = 0;
			}
			for(int k=0;k<n;k++)
				if(z[k]!=0) counts++;
			if(t!=0)
				System.out.println(counts);
			else System.out.println(counts-1);
		}
			
	}
}
