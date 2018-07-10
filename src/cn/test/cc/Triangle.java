package cn.test.cc;

public class Triangle {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 3;
		System.out.print(a + " " + b + " " + c + ":");
		if (judgeTriangle(a, b, c)) {
			if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
				System.out.println("is right triangle!");
			else if (a == b || a == c)
				System.out.println("is equicrural triangle!");
			else if (a == b && a == c)
				System.out.println("is equilateral triangle!");
			else
				System.out.println("is general triangle!");
		} else
			System.out.println("you can't make a triangle");
	}

	private static boolean judgeTriangle(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a)
			return true;
		return false;
	}
}
