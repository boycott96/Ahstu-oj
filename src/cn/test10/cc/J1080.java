package cn.test10.cc;

import java.util.Scanner;

public class J1080 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int sum = 0;
		while (cn.hasNext()) {
			long n = cn.nextLong();
			if (n == 0) {
				sum++;
				continue;
			}
			if (n < 65536)
				continue;
			char a[] = new char[32];
			int j;
			String m = Long.toBinaryString(n);
			for (j = 0; j < a.length; j++)
				a[j] = '0';
			j = 32 - m.length();
			for (int i = 0; i < m.length(); i++)
				a[j++] = m.charAt(i);
			int k;
			for (k = 0; k < 16; k++)
				if (a[k] != a[31 - k])	break;
			if (k == 16)sum++;
		}
		System.out.println(sum);
		cn.close();
	}
}
