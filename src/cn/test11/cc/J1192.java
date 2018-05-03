package cn.test11.cc;

import java.util.Scanner;

public class J1192 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int[] a = new int[n];
			for(int i =0;i<n;i++){
				a[i] = cn.nextInt();
			}
			int max = 0;
			for(int i =0;i<n;i++){
				int counts =0;
				for(int j =i+1;j<n;j++){
					if(a[i]==a[j]){
						counts ++;
						i =j;
					}else break;
				}
				if(max<counts) max = counts;
			}
			System.out.println(max+1);
		}
	}
}
