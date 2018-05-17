package cn.test10.cc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class J1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.next();
			System.out.println(removeInvalidParentheses(str).toString());
		}
		sc.close();
	}

	public static List<String> removeInvalidParentheses(String s) {
	    List<String> ans = new ArrayList<>();
	    remove(s, ans, 0, 0, new char[]{'(', ')'});
	    return ans;
	}

	public static void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
	    for (int stack = 0, i = last_i; i < s.length(); ++i) {
	        if (s.charAt(i) == par[0]) stack++;
	        if (s.charAt(i) == par[1]) stack--;
	        if (stack >= 0) continue;
	        for (int j = last_j; j <= i; ++j)
	            if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
	                remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
	        return;
	    }
	    String reversed = new StringBuilder(s).reverse().toString();
	    if (par[0] == '(') // finished left to right
	        remove(reversed, ans, 0, 0, new char[]{')', '('});
	    else // finished right to left
	        ans.add(reversed);
	}
}
