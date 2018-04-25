package cn.test.cc;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

	String root;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree() {
		root = "";
		left = right = null;
	}

	public BinaryTree(String root, BinaryTree left, BinaryTree right) {
		super();
		this.root = root;
		this.left = left;
		this.right = right;
	}

	public static BinaryTree buildTree(List<String> exp) {

		Stack<BinaryTree> st = new Stack<>();
		for (String e : exp) {
			if ("+-*/".contains(e)) {
				BinaryTree op = new BinaryTree(e, null, null);
				BinaryTree b = st.pop();
				BinaryTree a = st.pop();
				op.right = b;
				op.left = a;
				st.push(op);
			} else {
				st.push(new BinaryTree(e, null, null));
			}
		}
		return st.pop();
	}

	public void midVisit(StringBuffer sb) {
		if ("+-".contains(root)) {
			if (left != null) {
				sb.append("(");
				left.midVisit(sb);
			}
			sb.append(root);
			if (right != null) {
				right.midVisit(sb);
				sb.append(")");
			}
		} else {
			if (left != null) {
				left.midVisit(sb);
			}
			sb.append(root);
			if (right != null) {
				right.midVisit(sb);
			}
		}

	}

	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.buildTree(Arrays.asList("8 7 1 + 5 - *".split(" ")));
		StringBuffer sb = new StringBuffer("");
		bt.midVisit(sb);
		System.out.println(sb);
	}
}
