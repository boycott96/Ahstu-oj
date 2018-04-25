package cn.test10.cc;

import java.util.Scanner;
import java.util.TreeSet;

public class J1056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for(int i =0;i<n;i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set.size());
		System.out.print(set.first());
		set.remove(set.first());
		for(Integer i: set) {
			System.out.print(" "+i);
		}
		System.out.println();
		sc.close();
	}
}
