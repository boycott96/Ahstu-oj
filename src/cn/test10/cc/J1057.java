package cn.test10.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation Apr 4, 2018
 *
 */
public class J1057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count=0;
		for(int i=a;i<b;i++) {
			if(judge(i)) {
				count+=i;
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static boolean judge(int i) {
		if(i%3==1&&i%5==3) return true;
		return false;
	}
}
