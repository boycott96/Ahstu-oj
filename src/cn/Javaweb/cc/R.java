package cn.Javaweb.cc;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * 
 * @author Huai
 * @creation 6:22:03 PMApr 8, 2018
 *
 */
public class R {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0)
				break;
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				list.add(i + 1);
			}
			int length = list.size();
			while (length > 1) {
				m = (m - 1) % length;
				list.remove(m);
				length = list.size();
				m += k;
			}
			for (Integer i : list) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
