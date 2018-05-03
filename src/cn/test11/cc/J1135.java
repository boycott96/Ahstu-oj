package cn.test11.cc;

import java.util.Scanner;

public class J1135 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int vul = cn.nextInt();
		int d = cn.nextInt();
		int sum = 0;
		int i,counts= 0;
		for(i =1;;i++){
			if(sum+i*d<vul){
				sum+=i*d;
				counts++;
			}
			else{
				break;
			}
		}
		if(vul%d!=0)
			vul= vul/d+counts+1;
		else vul = vul/d+counts;
		System.out.println(vul);
	}
}
