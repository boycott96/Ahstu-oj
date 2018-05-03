package cn.test10.cc;

import java.util.Scanner;

public class J1087 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			String s = cn.nextLine();
			s = s.replaceAll(" ", "");
			System.out.println(s);
		}
		cn.close();
	}
}
