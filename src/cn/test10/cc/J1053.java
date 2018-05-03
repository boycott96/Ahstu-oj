package cn.test10.cc;

import java.util.Scanner;

public class J1053 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int M = cn.nextInt();
		while (M-- >= 0) {
			String str = cn.nextLine();
			int numberCount = getCountNumber(str);
			int charLowerCount = getCountLower(str);
			int charUpperCount = getCountUpper(str);
			int charSpecialCount = getCountSpecial(str);
			if (str.length() >= 8 && str.length() <= 16) {
				if ((numberCount == 0 && charLowerCount > 0 && charUpperCount > 0 && charSpecialCount > 0)
						|| (numberCount > 0 && charLowerCount == 0 && charUpperCount > 0 && charSpecialCount > 0)
						|| (numberCount > 0 && charLowerCount > 0 && charUpperCount == 0 && charSpecialCount > 0)
						|| (numberCount > 0 && charLowerCount > 0 && charUpperCount > 0 && charSpecialCount == 0)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		cn.close();
	}

	private static int getCountSpecial(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '~' || str.charAt(i) == '!' || str.charAt(i) == '@' || str.charAt(i) == '#'
					|| str.charAt(i) == '$' || str.charAt(i) == '%' || str.charAt(i) == '^') {
				count++;
			}
		}
		return count;
	}

	private static int getCountUpper(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static int getCountLower(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static int getCountNumber(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
