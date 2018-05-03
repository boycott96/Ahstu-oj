package cn.test10.cc;

import java.util.Scanner;

public class J1060 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			if(n ==0 ) return;
			int[] a = new int[100];
			for(int i =0;i<n;i++){
				a[i] = cn.nextInt();
			}
			for(int i =0;i<n;i++){
				for(int j =i+1;j<n;j++){
					if(Math.abs(a[i])>Math.abs(a[j])){
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for(int i = n-1 ;i>=0;i--){
				if(i>0){
					System.out.print(a[i]+" ");
				}
				else{
					System.out.println(a[i]);
				}
			}
		}
		cn.close();
	}
}
