package cn.test.cc;

import java.util.ArrayList;
import java.util.TreeSet;

public class Treeset {
	static int[] findTheAbsentStudents(int n, int[] a) {
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i : a) {
			ts.add(i);
		}
		System.out.println(ts.toString());
		int length = n - ts.size();
		int[] b = new int[length];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (ts.add(i)) {
				b[j] = i;
				j++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 1;i<19;i++) {
			al.add(i);
			al.remove(0);
		}
		//al.clear();
		System.out.println(al.isEmpty()+al.toString());
		System.out.println(100%11);
	}
}
