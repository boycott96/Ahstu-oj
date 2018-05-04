package cn.Javaweb.cc;

import java.util.Scanner;

public class N {
	private static int n;
	private static person[] child;
	private static long result = 0;

	/**
	 * A static block, once running, creating contain array element
	 * 
	 * @author SunRuiGuang
	 *
	 */
	static class person {
		private int high;
		private long count;

		private person(int high) {
			this.high = high;
			this.count = 0;
		}
	}

	/**
	 * Main running function, Enter the console data.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		N nl = new N();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		child = new person[n];
		for (int i = 0; i < n; i++) {
			int high = sc.nextInt();
			child[i] = new person(high);
		}

		nl.mergeSort(child);

		for (int i = 0; i < n; i++) {
			long count = child[i].count;
			result += count * (count + 1) / 2;
		}
		System.out.println(result);
		sc.close();
	}

	/**
	 * Mergesort algorithm.
	 * 
	 * @param t
	 *            an array of person items;
	 */
	private void mergeSort(person[] t) {
		if (t.length > 1) {
			person[] left = getHalf(t, 0);
			person[] right = getHalf(t, 1);
			mergeSort(left);
			mergeSort(right);
			Merge(t, left, right);
		}

	}

	/**
	 * Internal method that merges two sorted halves of a subarray.
	 * 
	 * @param t
	 *            an array of person items.
	 * @param left
	 *            an array of person items.
	 * @param right
	 *            an array of person items.
	 */
	private void Merge(person[] t, person[] left, person[] right) {
		int i = 0, j = 0;
		int leftlength = left.length, rightlength = right.length;
		
		while (i < leftlength && j < rightlength) {
			if (left[i].high > right[j].high) {
				right[j].count += (leftlength - i);
				j++;
			} else
				i++;

		}
		i = leftlength - 1;
		j = rightlength - 1;
		while (i >= 0 && j >= 0) {
			if (left[i].high > right[j].high) {
				left[i].count += (j + 1);
				i--;
			} else
				j--;
		}
		i = 0;
		j = 0;
		int index = 0;
		while (i < leftlength && j < rightlength) {
			if (left[i].high < right[j].high)
				t[index++] = left[i++];
			else
				t[index++] = right[j++];
		}
		while (i < leftlength)
			t[index++] = left[i++];
		while (j < rightlength)
			t[index++] = right[j++];
	}

	/**
	 * Used to split an array in two.
	 * 
	 * @param t
	 *            an array of person items.
	 * @param judge
	 *            to distinguish between sitting and right.
	 * @return
	 */
	private person[] getHalf(person[] t, int judge) {
		int length = t.length;
		person[] half;
		if (judge == 0) {
			half = new person[length / 2];
			for (int i = 0; i < half.length; i++)
				half[i] = t[i];
		} else {
			half = new person[length - length / 2];

			for (int i = 0; i < half.length; i++)
				half[i] = t[length / 2 + i];
		}
		return half;
	}
}
