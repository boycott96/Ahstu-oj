package cn.test11.cc;

import java.util.Scanner;

public class J1133 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			double p = cn.nextDouble();
			double q = cn.nextDouble();
			int i =1,j=1;
			boolean flag = true;
			while(flag){
				double s = 100.0*i/j;
				if(s>q) j++;
				else if(s<p) i++;
				else{
					System.out.println(j);
					flag = false;
				}
			}
		}
	}
}
