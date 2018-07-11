package cn.test.cc;

public class Test {
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {100,200,300,400};
		b = a;
		b[0] = 123;
		System.out.println(a+" "+b);
	}
}