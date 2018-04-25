package cn.test11.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @data 2018Äê4ÔÂ22ÈÕ
 */
public class J1126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char max='a';
			String strs = str.toLowerCase();
			for(int i = 0;i<strs.length();i++) {
				if(str.charAt(i)>max) {
					max = str.charAt(i);
				}
			}
			StringBuffer sb = new StringBuffer();
			for(int i =0;i<str.length();i++) {
				if(Character.toLowerCase(str.charAt(i))==max) {
					sb.append(str.charAt(i));
					sb.append("(max)");
				}
				else {
					sb.append(str.charAt(i));
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}
}
