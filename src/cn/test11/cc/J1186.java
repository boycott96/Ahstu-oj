package cn.test11.cc;

import java.util.Scanner;

public class J1186 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			String str = cn.next();
			String s = "";
			for (int i = 0; i < str.length(); i++)
				s += Dett(str.charAt(i));
			System.out.println(s);
		}
		cn.close();
	}

	private static String Dett(char charAt) {

		if (charAt == '1')
			return "0001";
		if (charAt == '2')
			return "0010";
		if (charAt == '3')
			return "0011";
		if (charAt == '4')
			return "0100";
		if (charAt == '5')
			return "0101";
		if (charAt == '6')
			return "0110";
		if (charAt == '7')
			return "0111";
		if (charAt == '8')
			return "1000";
		if (charAt == '9')
			return "1001";
		if (charAt == 'A')
			return "1010";
		if (charAt == 'B')
			return "1011";
		if (charAt == 'C')
			return "1100";
		if (charAt == 'D')
			return "1101";
		if (charAt == 'E')
			return "1110";
		if (charAt == 'F')
			return "1111";
		return "0000";

	}
}
