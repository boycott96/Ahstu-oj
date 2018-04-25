package cn.test.cc;

import java.util.Scanner;
/**
 * 
 * @author Huai
 * @data 2018-04-25
 */
public class DfsNumber01 {
	static int N = 9;
	static int[] value = new int[N];
	static boolean[] visited = new boolean[N];
	static boolean flag;
	
	static {
		for(int i =0;i<N;i++) {
			value[i] = i+1;
		}
	}
	
	static void dfs(int k, int n) {
		if (k == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
					if(visited[i]) sum+=factorial(value[i]);
			}
			if(sum==n)
				flag = true;
			return;
		}
		visited[k] = false;
		dfs(k+1,n);
		visited[k] = true;
		dfs(k+1,n);
	}

	static int factorial(int n) {
		return n < 2 ? 1 : factorial(n - 1) * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			flag = false;
			dfs(0, n);
			if(flag) System.out.println("Yes");
			else System.out.println("No");
		}
		sc.close();
	}
}
