package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1156 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int[] x= new int[n];
		int[] y = new int[n];
		for(int i =0 ;i<n;i++){
			x[i] =cn.nextInt();
			y[i] = cn.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		double zx ,zy;
		if(n%2==0){
			zx = 1.0*(x[n/2-1]+x[n/2])/2;
			zy = 1.0*(y[n/2-1]+y[n/2])/2;
		}else{
			zx = x[n/2];
			zy = y[n/2];
		}
		double sum =0;
		for(int i =0;i<n;i++){
			sum+= Math.abs(x[i]-zx);
			sum+=Math.abs(y[i]-zy);
		}
		
		System.out.println((int)sum);
	}
}
