package cn.test.cc;

/**
 * static表示空间内只能赋值一次，重新赋值，会将之前赋值所覆盖
 * @author SunRuiGuang
 *
 */
public class A {
	public static void main(String arge[]) {
		Point p1 = new Point(10, 10);
		System.out.println(p1.getAdd()+" " + p1.getX() + " " + p1.getY());  
		Point p2 = new Point(23, 35);
		System.out.println(p1 + " " + p2);
		System.out.println(p1.getAdd()+" " + p1.getX() + " " + p1.getY());
		System.out.println(p2.getAdd()+" " + p2.getX() + " " + p2.getY());
	}
}

class Point {
	private int x;
	private int y;

	Point(int a, int b) {
		x = a;
		y = b;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	int getAdd() {
		return x + y;
	}
}
