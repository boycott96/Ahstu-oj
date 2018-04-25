package cn.Javaweb.cc;

import java.util.Scanner;

/**
 * 
 * @author Huai
 * @creation 11:05:04 PMApr 8, 2018
 *
 */
public class S {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n % 3 != 0)
				System.out.println("Kiki");
			else
				System.out.println("Cici");
		}
		sc.close();
	}
}
