package cn.test12.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:21:53 PMApr 9, 2018
 *
 */
public class J1226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			String[] newstr = str.split(" ");
			for (int i = 0; i < newstr.length; i++) {
				newstr[i]=Character.toUpperCase(newstr[i].charAt(0))+newstr[i].substring(1);
			}
			StringBuffer sb = new StringBuffer(newstr[0]);
			for (int i = 1; i < newstr.length; i++) {
				sb.append(" "+newstr[i]);
			}
			System.out.println(sb);
			
		}
		sc.close();
	}
}
