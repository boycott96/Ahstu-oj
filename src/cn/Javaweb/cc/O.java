package cn.Javaweb.cc;

import java.util.Scanner;

public class O {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regex = " |\\,|\\.";
		String[] str1 = str.split(regex);
		int[] aint = new int[str1.length];
		for(int i =0;i<str1.length;i++) {
			str1[i] = str1[i].toLowerCase();
		}
		for (int i = 0; i < str1.length - 1; i++) {
			if (str1[i] == "")
				continue;
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].equals(str1[j])) {
					aint[i]++;
					str1[j] = "";
				}
			}
		}
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equals(""))
				continue;
			System.out.print(str1[i].toUpperCase()+":");
			int t = aint[i]+1;
			while(t-->0) {
				System.out.print("*");
			}
			System.out.println(aint[i]+1);
		}
		sc.close();
	}
}
