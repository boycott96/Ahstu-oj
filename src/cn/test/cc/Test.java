package cn.test.cc;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		TreeMap<String, String> map = new TreeMap<>();
		ts.add('A'+'B');
		ts.add('B'+'A');
		map.put("B", "A");
		map.put("A", "B");
		System.out.println(ts.toString());
		StringBuilder b = new StringBuilder();
		System.out.println(b.length());
	}
}
