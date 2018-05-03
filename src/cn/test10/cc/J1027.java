package cn.test10.cc;

public class J1027 {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			int a = i % 100;
			int b = i / 100;
			if(Math.pow(a+b, 2)==i) {
				System.out.print(i+" ");
			}
		}
	}
}
