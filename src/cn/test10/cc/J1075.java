package cn.test10.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1075 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		Arrays.fill(b, 0);
		for (int i = 0; i < n; i++) {
			a[i] = cn.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(a[i]==a[j]) b[i]++;
			}
		}
		int max = 0;
		int s = 0; 
		for(int i = 0; i < n; i++){
			if(b[i]>max){
				max = b[i];
				s = a[i];
			}
		}
		System.out.println(s);
		System.out.println(max);
		cn.close();
	}
}
