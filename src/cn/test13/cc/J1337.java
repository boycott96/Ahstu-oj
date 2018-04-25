package cn.test13.cc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class J1337 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		TreeSet<String> ts = new TreeSet<>();
		ArrayList<String> al = new ArrayList<>();
		al.add(t);
		ts.add(t);
		halfSet(ts,al,al.get(0).toString().length());
		System.out.println(al.size());
		sc.close();
	}

	private static void halfSet(TreeSet<String> ts, ArrayList<String> al,int length) {
		String k = al.get(al.size()-1);
		int m = Integer.parseInt(k.substring(0, length));
		if (m < 1)
			return;
		for (int i = 1; i <= m / 2; i++) {
			String t = String.valueOf(i) + k;
			if(ts.add(t)) {
				al.add(t);
				halfSet(ts,al,Integer.toString(i).length());
			}
		}
	}
}
