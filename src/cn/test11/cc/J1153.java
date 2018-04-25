package cn.test11.cc;

import java.util.ArrayList;

/**
 * 
 * @author Huai
 * @creation 10:47:16 PMApr 6, 2018
 *
 */
public class J1153 {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 100; i <= 200; i++) {
			if (isPrime(i)) {
				count++;
				li.add(i);
			}
		}
		System.out.println(count);
		System.out.print(li.get(0));
		li.remove(0);
		for (Integer i : li) {
			System.out.print(" " + i);
		}
	}

	private static boolean isPrime(int i) {
		if (i == 2)
			return true;
		if (i < 2 || i % 2 == 0)
			return false;
		for (int c = 3; c <= Math.sqrt(i); c += 2)
			if (i % c == 0)
				return false;
		return true;
	}
}
