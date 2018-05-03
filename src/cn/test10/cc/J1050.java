package cn.test10.cc;

import java.util.Scanner;

public class J1050 {
	public static void main(String[] args) {
		Scanner cn = new Scanner (System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			int m = cn.nextInt();
			int sum =0;
			int ai = 2;
			int count = 0;
			for(int i =1;i<=n;i++){
				sum+=ai;
				ai+=2;
				if(i%m==0){
					count++;
					if(count!=1)
						System.out.print(" ");
					System.out.print(sum/m);
					sum=0;
				}
			}
			if(n%m==0)
				System.out.println();
			else System.out.println(" "+sum/(n%m));
		}
		cn.close();
	}
}
