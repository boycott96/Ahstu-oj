package cn.test.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Modulo {
	static long howManyGoodSubarrays(int[] A, int m, int k) {
		int ite = 0;
		List<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			ArrayList<Integer> array = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				array.add(A[j]);
			}
			list.add(array);
		}
		int length = list.get(list.size() - 1).size(), i = 0;
		while (i++ < length) {
			if (list.get(0).isEmpty())
				list.remove(0);
			System.out.println(list.toString());
			for (ArrayList<Integer> al : list) {
				Iterator<Integer> it = al.iterator();
				long c = 1;
				while (it.hasNext()) {
					c *= it.next();
				}
				if (c % m == k)
					ite++;
				al.remove(0);
			}
		}
		return ite;
	}

	public static void main(String[] args) {
		int A[] = { 1, 10, 10 };
		System.out.println(howManyGoodSubarrays(A, 11, 1));
	}
}
