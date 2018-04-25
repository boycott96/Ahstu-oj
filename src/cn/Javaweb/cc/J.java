package cn.Javaweb.cc;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * 
 * @author Huai
 * @data 2018Äê4ÔÂ15ÈÕ
 */
public class J {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(HuffmanMax(a));
        System.out.println(HuffmanMin(k, a));
        sc.close();
    }
     
    private static int HuffmanMax(int[] a) {
    	TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
        int max = 0;
        while (ts.size() > 2) {
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += ts.last();
                ts.remove(ts.last());
            }
            max += sum;
            ts.add(sum);
        }
        while (!ts.isEmpty()) {
            max += ts.last();
            ts.remove(ts.last());
        }
        return max;
	}

	private static int HuffmanMin(int k, int[] a) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
        int min = 0;
        while (ts.size() > k) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += ts.first();
                ts.remove(ts.first());
            }
            min += sum;
            ts.add(sum);
        }
        while (!ts.isEmpty()) {
            min += ts.first();
            ts.remove(ts.first());
        }
        return min;
    }
	
}
