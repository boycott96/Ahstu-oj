package cn.test10.cc;

import java.util.Scanner;

public class J1083 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int[] a = new int[1011];
		while (cn.hasNext()) {
			int n = cn.nextInt();
			if (n == 0) {
				System.out.println(n + "-->" + n);
			} else if(n>0){
				int t = n;
				int i = 0;
				while (t > 0) {
					a[i] = t % 2;
					t /= 2;
					i++;
				}
				System.out.print(n + "-->");
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(a[j]);
				}
				System.out.println();
			}
			else{
				int z = Math.abs(n);
				int i = 0;
				while (z > 0) {
					a[i] = z % 2;
					z /= 2;
					i++;
				}
				System.out.print(n + "-->"+"-");
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(a[j]);
				}
				System.out.println();
				
			}
		}
		cn.close();
	}
}
