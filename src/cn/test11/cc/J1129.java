package cn.test11.cc;

import java.util.Scanner;

public class J1129 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int sum = 0;
		while (cn.hasNext()) {
			int n = cn.nextInt();
			boolean fi = true;
			while (fi) {
				for (int i1 = 9; i1 < 12; i1++) {
					for (int i2 = 9; i2 < 12; i2++) {
						for (int i3 = 9; i3 < 12; i3++) {
							for (int i4 = 9; i4 < 12; i4++) {
								for (int i5 = 9; i5 < 12; i5++) {
									for (int i6 = 9; i6 < 12; i6++) {
										for (int i7 = 9; i7 < 12; i7++) {
											for (int i8 = 9; i8 < 12; i8++) {
												for (int i9 = 9; i9 < 12; i9++) {
													for (int i10 = 9; i10 < 12; i10++) {
														sum = i1 * 1 + i2 * 3
																+ i3 * 9 + i4
																* 27 + i5 * 81
																+ i6 * 243 + i7
																* 729 + i8
																* 2187 + i9
																* 6561 + i10
																* 19683;
														if (sum == n) {
															System.out
																	.println(i1
																			+ " "
																			+ i2
																			+ " "
																			+ i3
																			+ " "
																			+ i4
																			+ " "
																			+ i5
																			+ " "
																			+ i6
																			+ " "
																			+ i7
																			+ " "
																			+ i8
																			+ " "
																			+ i9
																			+ " "
																			+ i10);
															fi = false;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
