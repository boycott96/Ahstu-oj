package cn.test10.cc;

import java.util.Scanner;

public class J1093 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int[] a = new int[1001];
			int i =0;
			for(;;i++){
				a[i] = cn.nextInt();
				if(a[i]==0) break;
			}
			int max = a[0];
			for(int j =0;j<i;j++){
				if(max<a[j]) max = a[j];
			}
			System.out.println(max);
		}
		cn.close();
	}
}
