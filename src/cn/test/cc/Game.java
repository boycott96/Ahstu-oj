package cn.test.cc;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Game {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int[] a = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.close();
		String[] op = "+-*/".split("");
		StringBuffer sb = new StringBuffer("");
		int n = 0;
		boolean flag = false;
		while (n < 10000) {
			List<String> exp = new Vector<>();
			for (int i : a)
				exp.add(Double.toString(i * 1.0));
			for (int i = 0; i < 3; i++)
				exp.add(op[ran.nextInt(4)]);
			Collections.shuffle(exp);
			if (RPorlandExpression.evalue(exp) == 24.0) {
				BinaryTree.buildTree(exp).midVisit(sb);
				flag = true;
				break;
			}
			n++;
		}
		if (flag)
			System.out.println(sb);
		else
			System.out.println("no answer");
	}
}
