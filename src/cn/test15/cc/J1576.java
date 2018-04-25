package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:11:56 AMApr 10, 2018
 *
 */
public class J1576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int i= 0;i<n;i++) {
				int x =sc.nextInt();
				if(x<min) min = x;
				if(x>max) max = x;
			}
			System.out.println(max-min);
		}
		sc.close();
	}
}
