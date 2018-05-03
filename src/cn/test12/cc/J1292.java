package cn.test12.cc;

import java.util.Scanner;

public class J1292 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int a = cn.nextInt();
			int b = cn.nextInt();
			int c = cn.nextInt();
			int i = 10;
			for(;i<=100;i++){
				if(i%3 ==a&&i%5==b&&i%7==c)
					break;
			}
			if(i<=100)
				System.out.println(i);
			else System.out.println("No answer");
		}
	}
}
