package cn.test10.cc;

import java.util.Scanner;

public class J1051 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int m = cn.nextInt();
			
			int[] a= new int[n];
			for(int j=0;j<n;j++){
				a[j]=j+1;
			}
			
			int i = 0;
			int len = n;
			int count=1;
			
			while(len>1){
				if(a[i%n]>0){
					if(count%m==0){
						a[i%n]=-1;
						len--;
						count=1;
						i++;
					}else{
						i++;
						count++;
					}
				}
				else{
					i++;
				}
			}
			for(int j=0;j<n;j++){
				if(a[j]>0){
					System.out.println(a[j]);
				}
			}
		}
		cn.close();
	}
}
