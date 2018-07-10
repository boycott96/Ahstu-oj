package cn.codesprint13.cc;

import java.util.*;

public class Solution2 {

	static int a;
	static int b;
	static int f;
	static int s;
	static int t;

	// Complete the membersInTheLargestGroups function below.
	static void membersInTheLargestGroups(int n, int m, int a, int b, int f, int s, int t) {
		TreeMap<String, Integer> map = new TreeMap<>();
		String[] names = new String[n];
		StringBuffer str = new StringBuffer();
		UF uf = new UF(n);
		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			int grade = scanner.nextInt();
			if (grade == 1)
				uf.grade1[i]++;
			else if (grade == 2)
				uf.grade2[i]++;
			else if (grade == 3)
				uf.grade3[i]++;

			map.put(name, i);
			names[i] = name;
		}
		for (int i = 0; i < m; i++) {
			String one = scanner.next();
			String two = scanner.next();
			uf.union(map.get(one), map.get(two));
		}

		for (int i = 0; i < n; i++) {
			if (uf.sizes[i] >= a) {
				uf.groupFormed[i] = 1;
			}
		}

		int max = -1;

		Vector<Integer> vect = new Vector<>();
		for (int i = 0; i < n; i++) {
			if (uf.sizes[i] > max && uf.groupFormed[i] == 1) {
				vect.clear();
				vect.add(i);
				max = uf.sizes[i];
			} else if (uf.sizes[i] == max && uf.groupFormed[i] == 1) {
				vect.add(i);
			}
		}

		int[] findSetArray = new int[n];

		for (int i = 0; i < n; i++) {
			findSetArray[i] = uf.findSet(i);
		}

		Vector<String> svect = new Vector<>();
		for (int i = 0; i < vect.size(); i++) {
			for (int j = 0; j < n; j++) {
				if (findSetArray[j] == vect.get(i)) {
					svect.add(names[j]);
				}
			}
		}
		Collections.sort(svect);

		for (int i = 0; i < svect.size(); i++) {
			str.append(svect.get(i) + "\n");
		}
		if (svect.size() == 0) {
			str.append("no-groups");
		}

		System.out.println(str);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nmabfst = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nmabfst[0]);

		int m = Integer.parseInt(nmabfst[1]);

		a = Integer.parseInt(nmabfst[2]);

		b = Integer.parseInt(nmabfst[3]);

		f = Integer.parseInt(nmabfst[4]);

		s = Integer.parseInt(nmabfst[5]);

		t = Integer.parseInt(nmabfst[6]);

		membersInTheLargestGroups(n, m, a, b, f, s, t);

		scanner.close();
	}
}

class UF {
	int size;
	int[] array;
	int[] sizes;
	int[] groupFormed;
	int[] grade1;
	int[] grade2;
	int[] grade3;

	public UF(int n) {
		size = n;

		array = new int[n];
		sizes = new int[n];
		groupFormed = new int[n];
		grade1 = new int[n];
		grade2 = new int[n];
		grade3 = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = i;
			sizes[i] = 1;
		}
	}

	int size() {
		return size;
	}

	int findSet(int i) {
		if (array[i] == i)
			return i;
		else
			return findSet(array[i]);
	}

	boolean isSameSet(int i, int j) {
		return findSet(i) == findSet(j);
	}

	void union(int i, int j) {
		int a = findSet(i);
		int b = findSet(j);

		if (isSameSet(a, b)) {
			return;
		} else {
			int sa = sizes[a];
			int sb = sizes[b];

			if (sa + sb <= Solution2.b) {
				int g1 = grade1[a];
				int g2 = grade2[a];
				int g3 = grade3[a];

				int g11 = grade1[b];
				int g22 = grade2[b];
				int g33 = grade3[b];

				if (g1 + g11 <= Solution2.f && g2 + g22 <= Solution2.s && g3 + g33 <= Solution2.t) {
					if (sa > sb) {
						array[b] = a;
						sizes[a] = sa + sb;
						grade1[a] = g1 + g11;
						grade2[a] = g2 + g22;
						grade3[a] = g3 + g33;
					} else {
						array[a] = b;
						sizes[b] = sa + sb;
						grade1[b] = g1 + g11;
						grade2[b] = g2 + g22;
						grade3[b] = g3 + g33;
					}
				}
			}
		}
	}
}
