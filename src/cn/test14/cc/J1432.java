package cn.test14.cc;

import java.util.LinkedList;
import java.util.Scanner;

public class J1432 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t = cn.nextInt();
		while (t-- > 0) {
			int n = cn.nextInt();
			int m = cn.nextInt();
			Bread[] br = new Bread[m];
			for (int i = 0; i < m; i++) {
				int a = cn.nextInt();
				int b = cn.nextInt();
				br[i] = new Bread(a, b);
			}
			sort(br);
			LinkedList<Integer> ln = new LinkedList();
			ln.addFirst(br[0].getA());
			ln.addLast(br[0].getB());
			int maxA = br[0].getA(), maxB = br[0].getB();
			for (int i = 1; i < m; i++) {
				if (maxA < br[i].getA()) {
					if (maxA == br[i].getB()) {
						ln.addFirst(br[i].getA());
						maxB = br[i].getB();
					} else {
						if (maxB == br[i].getA()) {
							ln.addLast(br[i].getB());
							maxB = br[i].getB();
						} else {
							if (maxB < br[i].getB()) {
								maxB = br[i].getB();
								ln.addFirst(br[i].getB());
								ln.addFirst(br[i].getA());
							} else {
								ln.addFirst(br[i].getA());
							}
						}
					}
					maxA = br[i].getA();
				} else if (maxA == br[i].getA()) {
					ln.add(i, br[i].getB());
				} else if (maxA > br[i].getA()) {
					ln.addLast(br[i].getA());
					ln.addLast(br[i].getB());
				}
			}
			if (ln.size() != n)
				System.out.println(-1);
			else
				print(ln);

		}
	}

	private static void print(LinkedList ln) {
		for (int i = 0; i < ln.size(); i++) {
			if (i != ln.size() - 1)
				System.out.print(ln.get(i) + " ");
			else
				System.out.println(ln.get(i));
		}
	}

	private static void sort(Bread[] br) {
		int n = br.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (br[i].getB() > br[j].getB()) {
					Bread temp = br[i];
					br[i] = br[j];
					br[j] = temp;
				} else if (br[i].getB() == br[j].getB()) {
					if (br[i].getA() > br[j].getB()) {
						Bread temp = br[i];
						br[i] = br[j];
						br[j] = temp;
					}
				}
			}
		}
	}
}

class Bread {
	private int a;
	private int b;

	public Bread() {
		super();
	}

	public Bread(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

}