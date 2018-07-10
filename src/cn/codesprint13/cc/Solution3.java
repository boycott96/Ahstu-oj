package cn.codesprint13.cc;

import java.io.*;
import java.util.*;

public class Solution3 {
	// Complete the howManyGoodSubarrays function below.
	static long howManyGoodSubarrays(int[] A, int m, int k) {
		long total = 0;
		// Initialize product to k rather than 1 to deal with the case k = 0.
		// This is safe because if k != 0 mod m then x != 0 mod m => x * k != 0 mod m.
		long product = k;
		Map<Long, Integer> counts = new HashMap<>();
		increment(counts, (product * k) % m);
		for (int j = 0; j < A.length; j++) {
			long current = A[j] % m;
			if (current == 0) {
				counts.clear();
				product = k;
			} else {
				product = (product * current) % m;
				total += counts.getOrDefault(product, 0);
			}
			// Count all solutions of i < j to implicit equation P_j = P_i * k mod m.
			// If k = 0 this counts all consecutive non zero elements before.
			increment(counts, (product * k) % m);
		}
		if (k == 0) {
			// If k = 0 the good arrays are all those which contain a zero.
			// We counted all arrays which don't contain a zero so return complement.
			long n = A.length;
			return (n * (n + 1) / 2) - total;
		}
		return total;
	}

	private static <K> void increment(Map<K, Integer> counts, K key) {
		counts.put(key, counts.getOrDefault(key, 0) + 1);
	}

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\SunRuiGuang\\Desktop\\input.txt");
		Scanner scanner = new Scanner(file);
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("C:\\Users\\SunRuiGuang\\Desktop\\input02.txt"));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nmk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nmk[0]);

			int m = Integer.parseInt(nmk[1]);

			int k = Integer.parseInt(nmk[2]);

			int[] A = new int[n];

			String[] AItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int AItem = Integer.parseInt(AItems[i]);
				A[i] = AItem;
			}

			long result = howManyGoodSubarrays(A, m, k);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
