package cn.Javaweb.cc;

import java.util.Scanner;

public class L {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while (k-- > 0) {
			/**
			 * 找出等号后的第一个分子字符串
			 */
			String str = sc.next();
			int index = str.indexOf("=") + 1;
			String newstr = str.substring(index);
			int newindex = newstr.indexOf("+");
			if (newindex > 0)
				newstr = newstr.substring(0, newindex);
			/**
			 * 判断是否有括号
			 */
			boolean weatherS = false;
			int strIndex = newstr.indexOf("(");
			if (strIndex > 0)
				weatherS = true;
			/**
			 * 进行字符串倍数判断
			 */
			boolean first = true;
			int multi = 1;
			char[] elements = newstr.toCharArray();
			int j = 0;
			StringBuffer strBuff = new StringBuffer();
			for (int i = 0; i < elements.length; i++) {
				if (Character.isDigit(elements[i])) {
					strBuff.append(elements[i]);
					j = i;
					first = false;
				} else {
					break;
				}
			}
			if (!first) {
				multi = Integer.parseInt(strBuff.toString());
				newstr = newstr.substring(j + 1);
			}
			int sum = 0;
			/**
			 * 根据是否有括号，进行处理
			 */
			if (weatherS) {
				String[] eleStr = newstr.split("\\(");
				for (String s : eleStr) {
					int rightIndex = s.indexOf(')');
					if (rightIndex > 0) {
						StringBuffer strB = new StringBuffer(s);
						strB.insert(0, '(');
						s = strB.toString();
					}
					sum += judgeStr(s);
				}
			} else {
				sum += judgeStr(newstr);
			}
			System.out.println(String.format("%04d", multi * sum));
		}
		sc.close();

	}

	private static int judgeStr(String str) {
		int num1 = 1, num2 = 0, pri = 1, par = 0;
		boolean f = false;
		int len = str.length();
		int index = str.indexOf("=") + 1;
		while (index != len) {
			if (str.charAt(index) == '(')
				f = true;
			if (str.charAt(index) == ')')
				f = false;
			else if (Character.isDigit(str.charAt(index))) {
				if (f)
					par += pri * (str.charAt(index) - '0' - 1);
				else if (!f && str.charAt(index - 1) == ')')
					par += par * (str.charAt(index) - '0' - 1);
				else
					num2 += pri * (str.charAt(index) - '0' - 1);
			} else {
				if (str.charAt(index) == 'N') {
					if (index != len - 1 && str.charAt(index + 1) == 'a')
						pri = 23;
					else if (index != len - 1 && str.charAt(index + 1) == 'i')
						pri = 59;
					else
						pri = 14;
				} else if (str.charAt(index) == 'C') {
					if (str.charAt(index + 1) == 'a')
						pri = 40;
					else if (index != len - 1 && str.charAt(index + 1) == 'l')
						pri = 35;
					else
						pri = 12;
				} else if (str.charAt(index) == 'O')
					pri = 16;
				else if (str.charAt(index) == 'S')
					pri = 32;
				else if (str.charAt(index) == 'H')
					pri = 2;
				else if (str.charAt(index) == 'A')
					pri = 27;
				else if (str.charAt(index) == 'Z')
					pri = 65;
				else if (str.charAt(index) == 'B')
					pri = 11;
				else {
					if (f)
						par -= pri;
					else
						num2 -= pri;
				}
				if (f)
					par += pri;
				else
					num2 += pri;
			}
			index++;
		}
		return num1 * (par + num2);
	}
}