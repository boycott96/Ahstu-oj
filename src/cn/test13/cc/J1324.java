package cn.test13.cc;

import java.util.Scanner;

public class J1324 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t = cn.nextInt();
		while(t-->0){
			String str = cn.next();
			int max = 0;
			for(int i = 0;i<str.length();i++){
				StringBuffer sb = new StringBuffer(str);
				int z = Integer.parseInt(sb.deleteCharAt(i).toString());
				if(max<z) max = z;
			}
			System.out.println(max);
		}
		cn.close();
	}
}
