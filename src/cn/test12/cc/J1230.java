package cn.test12.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1230 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			int pA = cn.nextInt();
			int qA = cn.nextInt();
			if(pA==0&&qA==0) return;
			int[][] a = new int[pA][qA];
			for (int i = 0; i < pA; i++)
				for (int j = 0; j < qA; j++)
					a[i][j] = cn.nextInt();
			int pB = cn.nextInt();
			int qB = cn.nextInt();
			int[][] b = new int[pB][qB];
			for (int i = 0; i < pB; i++)
				for (int j = 0; j < qB; j++)
					b[i][j] = cn.nextInt();
			int pC = cn.nextInt();
			int qC = cn.nextInt();
			int[][] c = new int[pC][qC];
			for (int i = 0; i < pC; i++)
				for (int j = 0; j < qC; j++)
					c[i][j] = cn.nextInt();
			if (qA == pB) {
				if (qC == qB && pC == pA) {
					int[][] as = new int[pC][qC];
					for (int i = 0; i < pC; i++) {
						for (int j = 0; j < qC; j++) {
							as[i][j] = 0;
						}
					}
					int z[][] = new int[a.length][b[0].length];
					for (int i = 0; i < a.length; i++) {
						for (int j = 0; j < b[0].length; j++) {
							int temp = 0;
							for (int x = 0; x < b.length; x++) {
								temp += a[i][x] * b[x][j];

							}
							z[i][j] = temp;

						}
					}
					boolean flag = true;
					for (int i = 0; i < pC; i++) {
						for (int j = 0; j < qC; j++) {
							if(z[i][j]!=c[i][j]) {
								System.out.println("No");
								flag = false;
								break;
							}
						}
						if(!flag) break;
					}
					if(flag) System.out.println("Yes");
				} else
					System.out.println("No");
			} else
				System.out.println("No");
		}
		cn.close();
	}
}
