package cn.Javaweb.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 11:19:21 PMApr 8, 2018
 *
 */
public class T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			double v = n*1000*1.0/3600;
			double t = v*1.0/(a*-1);
			double s = v*t + 0.5*a*t*t;
			System.out.format("%.3f\n",s);
		}
		sc.close();
	}
}
