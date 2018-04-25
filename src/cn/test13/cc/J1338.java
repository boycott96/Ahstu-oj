package cn.test13.cc;
//TODO
import java.util.Scanner;

public class J1338 {
	
	private static int total = 0;
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		long startTime = System.currentTimeMillis();
		solve(n);
		System.out.println(total+1);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		cn.close();
	}
	private static void solve(int n) {  
	    if(n == 1) {  
	        total+=2;  
	        return ;  
	    }  
	    int i;  
	    for(i = 2; i <= n/2+1; i++) {  
	        if(n % i == 0) {  
	            solve(n / i);  
	        }  
	    }  
	}
}
