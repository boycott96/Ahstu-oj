package cn.Javaweb.cc;

import java.util.Scanner;

/**
 * 
 * @author SunRuiGuang
 *
 */
public class I {
	// 在这里需要注意，最大值最好不要使用Integer.MAX_VALUE.
	// 因为在值进行加 1时，很容易overflow 变成负值，可以设置为Integer.MAX_VALUE - 1.
	private static final int MAX = 1000000;

	private static int n;
	private static int m;
	private static int[] T;
	private static int[] Coins;
	private static int[][] c;
	private static boolean[][] hasUsed;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		T = new int[n + 1];
		Coins = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			T[i] = sc.nextInt();
			Coins[i] = sc.nextInt();
		}
		m = sc.nextInt();
		c = new int[n + 1][m + 1];
		hasUsed = new boolean[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			c[i][0] = 0;
		}
		for (int j = 1; j <= m; j++) {
			c[0][j] = MAX;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				/**
				 * 判断是否可以进行找零，如果不可以，并将该枚硬币对应的boolean置为false. 如果可以进行动态规划找零， 就置为true.
				 * 
				 */
				if (j - T[i] < 0) {
					c[i][j] = c[i - 1][j];
					hasUsed[i][j] = false;
				} else if (c[i - 1][j] < 1 + c[i][j - T[i]]) {
					c[i][j] = c[i - 1][j];
					hasUsed[i][j] = false;
				} else {
					if (judge(i, j)) {
						c[i][j] = 1 + c[i][j - T[i]];
						hasUsed[i][j] = true;
					} else {
						c[i][j] = c[i - 1][j];
						hasUsed[i][j] = false;
					}
				}

			}
		}
		/**
		 * 
		 */
		if (c[n][m] >= MAX) {
			System.out.println(-1);
		} else {
			System.out.println(c[n][m]);
		}
		sc.close();
	}

	/**
	 * Used judge coin amounts overflow.
	 * 
	 * @param i
	 *            point coin amounts array.
	 * @param j
	 *            count coin amounts.
	 * @return boolean
	 */
	private static boolean judge(int i, int j) {
		int sum = 1;
		j -= T[i];
		while (j >= 1) {
			if (hasUsed[i][j]) {
				sum++;
			}
			j -= T[i];
		}
		if (sum > Coins[i]) {
			return false;
		} else {
			return true;
		}
	}
}
