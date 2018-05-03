package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1158 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int[] a = new int[21];
		String str = cn.nextLine();
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++)
			a[i] = Integer.parseInt(s[i]);
		
		int n = s.length;
		int max = 0,k = 1,x = 0,t = 0;

		while (t != k) {
			int i = 0,counts =0;
			t = k;
			for (int j = k; j < n; j++) {
				if (a[i] >= a[j]) {
					counts++;
					i = j;
				} else {
					x++;
					if (x < 2)
						k = j;
				}
			}
			if(max<counts) max =counts;
		}
		System.out.println(max+1);
	}
}
