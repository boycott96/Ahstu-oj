package cn.test11.cc;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * 
 * @author Huai
 * @creation 1:48:49 AMApr 10, 2018
 *
 */
public class J1141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0) break;
			Map<Integer,Object> map = new TreeMap<>();
			for(int i =0;i<n;i++) {
				int x = sc.nextInt();
				map.put(x, true);
			}
			Integer[] a= new Integer[map.size()];
			a = map.keySet().toArray(a);
			System.out.println(a.length);
			System.out.print(a[0]);
			for(int i = 1;i<a.length;i++) {
				System.out.print(" "+a[i]);
			}
			System.out.println();
			System.out.println();
		}
		sc.close();
	}
}
