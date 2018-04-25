package cn.test13.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 *
 * @creation Apr 4, 2018
 *
 */
public class J1311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i =a;i<=b;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static boolean isPrime(int i) {
		if(i==2) return true;
		if(i<2||i%2==0) return false;
		int m = (int) Math.sqrt(i);
		for(int c=3;c<=m;c+=2) {
			if(i%c==0) return false;
		}
		return true;
	}
}
