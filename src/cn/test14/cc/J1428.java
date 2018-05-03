package cn.test14.cc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J1428 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t = cn.nextInt();
		while(t-->0) {
			int n = cn.nextInt();
			int[] a = new int[n];
			for(int i =0;i<n;i++) {
				a[i] = cn.nextInt();
			}
			int k = cn.nextInt();
			Arrays.sort(a);
			List<Integer> result = new ArrayList<Integer>();
			result.add(a[a.length-1]);
			for(int i = a.length-2;i>=1;i--) {
				if(a[i]!=a[i+1]) {
					result.add(a[i]);
				}
			}
			if(a[0]!=a[1]) {
				result.add(a[0]);
			}
			System.out.println(result.get(k-1));
		}
	}
}
