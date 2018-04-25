package cn.test.cc;

import java.util.Collections;
import java.util.Vector;

public class CollectionShuffle {
	public static void main(String[] args) {
		String[] exp = "15+78-*".split("");
		Vector<String> v = new Vector<>();
		for (String e : exp)
			v.add(e);
		Collections.shuffle(v);

		for (int i = 0; i < 1000; i++) {
			Collections.shuffle(v);
			double ans = RPorlandExpression.evalue(v);
			if (ans == 24.0) {
				System.out.println(v);
				return;
			}
		}
	}
}
