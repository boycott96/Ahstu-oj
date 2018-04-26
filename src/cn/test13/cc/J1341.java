package cn.test13.cc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class J1341 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		int a[] = new int[10000000];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			if (ts.add(t))
				al.add(t);
			else {
				for (int j = 0; j < al.size(); j++) {
					if (al.get(j) == t) {
						a[j]++;
						break;
					}
				}
			}
		}
		int max = 0;
		for(int i =0;i<al.size();i++)
			if(max<a[i]) {
				max = a[i];
			}
		for(int i =0;i<al.size();i++)
			if(max==a[i]) {
				System.out.println(al.get(i));
				System.out.println(max+1);
			}
		sc.close();
	}
}
