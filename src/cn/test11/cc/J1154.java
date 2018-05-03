package cn.test11.cc;

import java.util.Scanner;

public class J1154 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			String str = cn.nextLine();
			for(int i =0;i<str.length();i++){
				if(str.charAt(i)=='0'){
					System.out.print(1);
				}else if(str.charAt(i)=='1'){
					System.out.print(0);
				}else System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		
	}
}
