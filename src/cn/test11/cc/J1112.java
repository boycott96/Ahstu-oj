package cn.test11.cc;

import java.util.LinkedList;
import java.util.Scanner;

public class J1112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		while(n-->0) {
			int[] a = new int[9];
			for(int i=0;i<9;i++) {
				a[i] = sc.nextInt();
			}
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(a[0]);
			for(int i =1;i<9;i++) {
				if(a[i]<a[0]) {
					ll.addFirst(a[i]);
				}
				else {
					ll.addLast(a[i]);
				}
			}
			System.out.print(ll.getFirst());
			for(int i =1;i<9;i++) {
				System.out.print(" "+ll.get(i));
			}
			System.out.println();
		}
		sc.close();
	}
}
