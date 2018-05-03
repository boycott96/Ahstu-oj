package cn.test10.cc;

import java.util.Scanner;

public class J1096 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String strA = cn.nextLine();
		String strB = cn.nextLine();
		System.out.println(getDistance(strA, strB));
		cn.close();
	}

	public static int getDistance(String strA, String strB) {
		if (strA.equals(strB)) {// �������ַ�����ͬ������0
			return 0;
		}
		int lengthA = strA.length();
		int lengthB = strB.length();
		int length = Math.max(lengthA, lengthB);// �ҵ������ַ����������ֵ���壬��ά����ĳ���
		int array[][] = new int[length + 1][length + 1];// ����һ����ά���飬�洢ת�ƾ���
		for (int i = 0; i <= length; i++) {// �߽�������ʼ��
			array[i][0] = i;

		}
		for (int j = 0; j <= length; j++) {
			array[0][j] = j;
		}

		for (int i = 1; i <= lengthA; i++) {// ״̬ת�Ʒ���
			for (int j = 1; j <= lengthB; j++) {
				array[i][j] = min(array[i - 1][j] + 1, array[i][j - 1] + 1,
						array[i - 1][j - 1] + (strA.charAt(i - 1) == strB.charAt(j - 1) ? 0 : 1));
			}
		}
		return array[lengthA][lengthB];
	}

	// ȡ�������е���Сֵ
	public static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
