package cn.test12.cc;

import java.util.Scanner;

public class J1265 {
	/**
	 * ����ǰ���������������ؽ�����������
	 * 
	 * @param preOrder
	 *            ǰ���������
	 * @param start
	 *            ������ʼλ��
	 * @param inOrder
	 *            �����������
	 * @param end
	 *            �����������λ��
	 * @param length
	 *            �����ڵ���
	 * @return �����ĸ��ڵ�
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
		// ������֤
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			return null;
		}
		// �����������ڵ�
		char value = preOrder[start];
		Node root = new Node();
		root.value = value;

		// �ݹ���ֹ����������ֻ��һ���ڵ�
		if (length == 1)
			return root;
		// �ֲ���������������������
		int i = 0;
		while (i < length) {
			if (value == inOrder[end - i]) {
				break;
			}
			i++;
		}
		// ����������������
		root.left = buildTree(preOrder, start + 1, inOrder, end - i - 1, length
				- 1 - i);
		// ����������������
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