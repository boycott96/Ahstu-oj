package cn.test12.cc;

import java.util.Scanner;
import java.util.Stack;

public class J1204 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int t = cn.nextInt();
		Stack<Character> sta = null;
		while (t-- > 0) {
			String str = cn.next();
			if (str.length() % 2 == 1)
				System.out.println("No");
			else {
				sta = new Stack<Character>();
				for (int i = 0; i < str.length(); i++) {
					if (sta.isEmpty())
						sta.push(str.charAt(i));
					else if (sta.peek() == '[' && str.charAt(i) == ']'
							|| sta.peek() == '(' && str.charAt(i) == ')'
							|| sta.peek() == '{' && str.charAt(i) == '}')
						sta.pop();
					else
						sta.push(str.charAt(i));

				}
				if (sta.isEmpty())
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
		cn.close();
	}
}
