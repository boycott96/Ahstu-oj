package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:35:41 PMApr 9, 2018
 *
 */
public class J1188 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int i = n/2;
			int j = i;
			while(i>0&&j<n) {
				if(i+j==n) {
					if(isprime(i)&&isprime(j)) {
						System.out.println(i+" "+j);
						break;
					}
				}
				i--;
				j++;
			}
		}
		sc.close();
	}

	private static boolean isprime(int i) {
		if(i==2) return true;
		if(i<2||i%2==0) return false;
		for(int c = 3;c<=Math.sqrt(i);c+=2) {
			if(i%c==0) return false;
		}
		return true;
	}
}
