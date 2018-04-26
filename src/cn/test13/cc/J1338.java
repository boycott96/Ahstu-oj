package cn.test13.cc;

import java.util.Scanner;

public class J1338 {
	
	private static int total = 0;
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		solve(n);
		
		for(int i = 2;i<=n/2;i++) {
			if(n%i==0) {
				for(int j = 2;j<=n/2;j++) {
					
				}
			}
		}
		System.out.println(total+1);
		cn.close();
	}
	private static void solve(int n) {  
	    if(n<2) {   
	        return ;  
	    }  
	    for(int i = 2; i <= n/2; i++) {  
	        if(n % i == 0) { 
	        	total++;
	            solve(n / i);  
	        }  
	    }  
	}
}
