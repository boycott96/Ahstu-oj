package cn.test10.cc;

import java.util.Scanner;

public class J1018 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int z = n*n*n;
			System.out.print(n+"*"+n+"*"+n+"="+z+"=");
			int sum = 0;
			for(int i = n*n-n+1;;i+=2){
				sum+=i;
				System.out.print(i);
				if(sum<z){
					System.out.print("+");
				}
				else {
					System.out.println();
					break;
				}
			}
		}
		cn.close();
	}
}
