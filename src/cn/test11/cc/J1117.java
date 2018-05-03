package cn.test11.cc;

import java.util.Scanner;

public class J1117 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int n = cn.nextInt();
			int m = cn.nextInt();
			if (n == 0 && m == 0)
				return;
			int i;
			for (i = 0; i < 100; i++) {
				int z = n * 100 + i;

				if (i < 10 && z % m == 0)
					System.out.print(0);
				if (z % m == 0) {
					System.out.print(i);
					break;
				}

			}
			for(int j=0;j<100;j++){
				int z = n * 100 + j;
				if(z%m==0&&j!=i){
					System.out.print(" "+j);
				}
			}
			System.out.println();
		}
	}
}
