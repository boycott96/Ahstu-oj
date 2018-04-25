package cn.test15.cc;

import java.util.Scanner;

/**
 * @author Huai
 * @creation 12:18:40 PMApr 8, 2018
 *
 */
public class J1572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int m = sc.nextInt();
			Selet[] se = new Selet[m];
			for (int i = 0; i < m; i++) {
				int length = sc.nextInt();
				int width = sc.nextInt();
				String name = sc.next();
				se[i] = new Selet(length, width, name);
			}
			for (int i = 0; i < m - 1; i++) {
				for (int j = i + 1; j < m; j++) {
					if (se[i].compareTo(se[j]) > 0) {
						Selet s = se[i];
						se[i] = se[j];
						se[j] = s;
					}
				}
			}
			System.out.println(se[0].getName());

		}
		sc.close();
	}
}

class Selet {
	private int length;
	private int width;
	private String name;

	public Selet(int length, int width, String name) {
		super();
		this.length = length;
		this.width = width;
		this.name = name;
	}

	public int compareTo(Selet e) {
		if (this.length > e.length)
			return -1;
		else if (this.length == e.length) {
			if (this.width < e.width)
				return -1;
			else if (this.width == e.width) {
				if (this.name.compareTo(e.name) >= 0)
					return -1;
				else
					return 1;
			} else
				return 1;
		} else
			return 1;

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}