package cn.test11.cc;

import java.util.Scanner;

public class J1150 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			String str = cn.next();
			int n = cn.nextInt();
			int an = (str.charAt(0)-'0')%n;
			for(int i=1;i<str.length();i++){
				an = (an*10+(str.charAt(i)-'0'))%n;
			}
			System.out.println(an);
		}
		cn.close();
	}
}
