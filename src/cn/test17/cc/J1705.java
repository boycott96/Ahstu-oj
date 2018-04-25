package cn.test17.cc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 1:44:38 PMApr 6, 2018
 *
 */
public class J1705 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int m = sc.nextInt();
			int a[] = new int[m];
			Integer b[] = new Integer[m];
			for (int i = 0; i < m; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1 < o2)
						return 1;
					if (o1 == o2)
						return 0;
					return -1;
				}

			});
			int sum = 0;
			for (int i = 0; i < m; i++) {
				sum += a[i] * b[i];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
