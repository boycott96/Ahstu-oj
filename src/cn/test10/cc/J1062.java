package cn.test10.cc;

import java.util.Scanner;

public class J1062 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int sum = 1;
			for(int i =n;i>1;i--){
				sum = (sum+1)*2;
			}
			System.out.println(sum);
		}
		cn.close();
	}
}
