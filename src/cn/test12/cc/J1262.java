package cn.test12.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @data 2018Äê4ÔÂ14ÈÕ
 */
public class J1262 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long n = sc.nextLong();
			int count=0;
			while(n>0) {
				if(n%2!=0) count++;
				n>>=1;
			}
			if(count%2==0) System.out.println("even");
			else System.out.println("odd");
		}
		sc.close();
	}
}
