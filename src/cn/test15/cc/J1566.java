package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 2:42:34 PMApr 10, 2018
 *
 */
public class J1566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			StringBuffer sb = new StringBuffer(sc.next());
			sb.reverse();
			System.out.println(isPrime(Integer.parseInt(sb.toString())));
		}
		sc.close();
	}

	private static char isPrime(int i) {
		if (i == 2)
			return 'Y';
		if (i < 2 || i % 2 == 0)
			return 'N';
		for (int c = 3; c <= Math.sqrt(i); c += 2)
			if (i % c == 0)
				return 'N';
		return 'Y';
	}
}
