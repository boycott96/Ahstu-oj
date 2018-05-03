package cn.test11.cc;

import java.util.Scanner;

public class J1166 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int[] n = new int[10001];
		int i =0;
		while(cn.hasNext()){
			n[i] =cn.nextInt();
			i++;
		}
		if(isSorted(n,i))
			System.out.println("YES");
		else System.out.println("NO");
	}

	private static boolean isSorted(int[] n,int i) {
		for(int j =0 ;j<i-1;j++){
			if(n[j]>n[j+1]) return false;
		}
		return true;
	}
}
