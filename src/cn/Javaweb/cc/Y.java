package cn.Javaweb.cc;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Y {
	/**public static void main(String[] args) {
		LinkList list = new LinkList();
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		for (int i = 0; i < size+size1; i++) {
			list.addAt(i, sc.nextInt(),sc.nextInt());
		}
		
		list.bubbleSort();
		list.listAll();
	}
}
class Node {
	private int data;
	private int val;
	private Node next; // 链表结点的指针域，指向直接后继结点

	public Node() {
		next = null;
	}

	public Node(int data,int val, Node next) {
		this.data = data;
		this.val = val;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

class LinkList {
	private Node head = null; // 头结点指针
	private int size = 0;

	public LinkList() {
		head = new Node();
		size = 0;
	}

	// 在i位置插入元素elem
	public boolean addAt(int i,int elem,int z) {
		if (i < 0 || i > size) {
			return false;
		}

		Node pre, curr;
		int pos;
		for (pre = head; i > 0 && pre.getNext() != null; i--, pre = pre.getNext())
			;
		curr = new Node(elem,z, pre.getNext());
		pre.setNext(curr);
		size++;
		return true;
	}

	public Node getHead() {
		return this.head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void listAll() {
		for (Node curr = head.getNext(); curr != null; curr = curr.getNext()) {
			System.out.println(curr.getData() + " "+curr.getVal());
		}
		System.out.println();
	}

	public void bubbleSort() {
		Node p, q;
		int temp,te;
		for (p = head.getNext(); p.getNext() != null; p = p.getNext()) {
			for (q = head.getNext(); q.getNext() != null; q = q.getNext()) {
				if (q.getData() > q.getNext().getData()) {
					temp = q.getData();
					te = q.getVal();
					q.setData(q.getNext().getData());
					q.setVal(q.getNext().getVal());
					q.getNext().setData(temp);
					q.getNext().setVal(te);
				}
			}
		}
	}
}**/
	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i =0;i<a+b;i++) {
			map.put(sc.nextInt(), sc.nextInt());
		}
//		for(int i:map.keySet())
//			System.out.println(i+" "+map.get(i));
		map.forEach((k,v)->System.out.println(k+" "+v));
		sc.close();
	}
}