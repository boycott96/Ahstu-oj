package cn.codesprint13.cc;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the findTheAbsentStudents function below.
    static int[] findTheAbsentStudents(int n, int[] a) {
    	TreeSet<Integer> ts = new TreeSet<>();
		for (int i : a) {
			ts.add(i);
		}
		int length = n - ts.size();
		int[] b = new int[length];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (ts.add(i)) {
				b[j] = i;
				j++;
			}
		}
		return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = findTheAbsentStudents(n, a);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
