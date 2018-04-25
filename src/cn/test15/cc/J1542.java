package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 12:25:36 PMApr 11, 2018
 *
 */
public class J1542 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sumn = n, apartment = 200, index = 0;
			boolean flag = false;
			for (int i = 2; i <= 20; i++) {
				sumn += n;
				apartment += apartment * k / 100;
				if (apartment <= sumn) {
					index = i;
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println(index);
			else
				System.out.println("Impossible");
		}
		sc.close();
	}
}
