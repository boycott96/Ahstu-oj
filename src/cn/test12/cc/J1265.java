package cn.test12.cc;

import java.util.Scanner;

public class J1265 {
	/**
	 * 根据前序遍历和中序遍历重建二叉树子树
	 * 
	 * @param preOrder
	 *            前序遍历数组
	 * @param start
	 *            子树起始位置
	 * @param inOrder
	 *            中序遍历数组
	 * @param end
	 *            中序遍历结束位置
	 * @param length
	 *            子树节点树
	 * @return 子树的根节点
	 */
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String str1 = cn.next();
		String str2 = cn.next();
		char[] preOrder = str1.toCharArray();
		char[] inOrder = str2.toCharArray();
		Node root = buildTree(preOrder, 0, inOrder, inOrder.length - 1,
				inOrder.length);
		postorder(root);
		System.out.println();
		cn.close();
	}

	public static void visit(Node p) {
		System.out.print(p.getValue());
	}

	public static Node buildTree(char[] preOrder, int start, char[] inOrder,
			int end, int length) {
		// 参数验证
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			return null;
		}
		// 建立子树根节点
		char value = preOrder[start];
		Node root = new Node();
		root.value = value;

		// 递归终止条件：子树只有一个节点
		if (length == 1)
			return root;
		// 分拆子树的左子树和右子树
		int i = 0;
		while (i < length) {
			if (value == inOrder[end - i]) {
				break;
			}
			i++;
		}
		// 建立子树的左子树
		root.left = buildTree(preOrder, start + 1, inOrder, end - i - 1, length
				- 1 - i);
		// 建立子树的右子树
		root.right = buildTree(preOrder, start + length - i, inOrder, end, i);

		return root;
	}

	public static void postorder(Node root) {
		if (root != null) {
			postorder(root.getLeft());
			postorder(root.getRight());
			visit(root);
		}
	}

}

class Node {
	Node left = null;
	Node right = null;
	char value;

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}