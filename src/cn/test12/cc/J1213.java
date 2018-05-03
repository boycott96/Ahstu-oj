package cn.test12.cc;

import java.util.Scanner;

public class J1213 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int[] num = new int[1000000];
		while(cn.hasNext()){
			int n = cn.nextInt();		
			if(!Dett(n))
				System.out.println("Unlucky");
			else{
				int j =1,i = 0;
				for(;j<=n;){
					if(Dett(j)){
						num[i] = j;
						i++;
						j++;
					}
					else 
						j++;
				}
				System.out.println(i);
			}
		}
	}
	public static boolean Dett(int t){
		while(t>0){
			if(t%10==0) return false;
			t/=10;
		}
		return true;
	}
}
