package cn.Javaweb.cc;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))){
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		sc.close();
	}
}