package cn.test.cc;

public class Test {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 0;
		c = a++;
		System.out.println(a);
		System.out.println(c);
		c = ++b;
		System.out.println(b);
		System.out.println(c);	
	}
}
