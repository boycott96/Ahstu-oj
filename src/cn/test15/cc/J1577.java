package cn.test15.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 8:16:15 AMApr 10, 2018
 *
 */
public class J1577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0) {
				if(b==0) {
					if(c==0) System.out.println("Abnormal");
					else System.out.println(0);
				}
				else System.out.println(1);
			}
			else {
				int s = b * b - 4 * a * c;
				if (s > 0)
					System.out.println(2);
				else if (s == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}
		}
		sc.close();
	}
}
