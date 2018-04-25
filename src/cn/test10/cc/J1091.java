package cn.test10.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 7:45:56 PMApr 4, 2018
 *
 */
public class J1091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.nextLine());
		if(sb.toString().equals(sb.reverse().toString()))
			System.out.println("Y");
		else System.out.println("N");
		sc.close();
	}
}
