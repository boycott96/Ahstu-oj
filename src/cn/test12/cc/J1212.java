package cn.test12.cc;

import java.util.Arrays;

public class J1212 {
	public static void main(String[] args) {
		Queens8();

	}

	public static boolean Chongtu(int a[], int n)// a[]位置数组，n皇后个数
	{
		int i = 0, j = 0;
		for (i = 2; i <= n; ++i)
			for (j = 1; j <= i - 1; ++j)//因为判断第i个棋子是否冲突（摆放是否合理），我们只需要和前面i-1列校对就ok了。这样也保证了,i>j的恒成立
				if ((a[i] == a[j]) || (Math.abs(a[i] - a[j]) == i - j))// 1：在一行；2：在对角线上
					return false; // 冲突
		return true;// 不冲突
	}

	// 八皇后：枚举算法
	public static void Queens8() {
		int[] a = new int[9];
		Arrays.fill(a, 0);
		int i = 0;

		for (a[1] = 0; a[1] < 8; ++a[1])
			for (a[2] = 0; a[2] < 8; ++a[2])
				for (a[3] = 0; a[3] < 8; ++a[3])
					for (a[4] = 0; a[4] < 8; ++a[4])
						for (a[5] = 0; a[5] < 8; ++a[5])
							for (a[6] = 0; a[6] < 8; ++a[6])
								for (a[7] = 0; a[7] < 8; ++a[7])
									for (a[8] = 0; a[8] < 8; ++a[8]) {
										if (!Chongtu(a, 8))// 如果冲突，则继续枚举
											continue;
										else {
											for (i = 1; i <= 8; ++i)
												System.out.print(a[i]);// 打印某种情况
											System.out.printf("\n");
										}
									}
	}
}
