package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1145 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String str;
		int[] num = new int[26];
		Arrays.fill(num, 0);
		boolean flag = true;
		while (cn.hasNext()) {
			if (flag)
				str = cn.nextLine();
			else
				break;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '#')
					flag = false;
				for (int j = 97,k=65; j <= 122; j++,k++) {
					if (str.charAt(i) == j||str.charAt(i)==k)
						num[j - 97]++;
				}
			}
			if (!flag)
				break;
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 97) + " " + num[i]);
		}
	}
}
