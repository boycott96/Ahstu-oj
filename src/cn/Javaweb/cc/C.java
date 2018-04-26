package cn.Javaweb.cc;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double p = sc.nextDouble();
			double q = sc.nextDouble();
			boolean flag = false;
			for (int i = 100; !flag; i += 100) {
				boolean flag1 = false;
				for (int j = 2; !flag1; j++) {
					double divide = 1.0 * i / j;
					if (divide <= p) {
						flag1 = true;
					}
					if (divide > p && divide < q) {
						System.out.println(j);
						flag1 = true;
						flag = true;
					}
				}
			}
		}
		sc.close();
	}
}
