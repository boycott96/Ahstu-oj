package cn.test11.cc;

import java.util.Arrays;
import java.util.Scanner;

public class J1198 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int a = cn.nextInt();
		int b = cn.nextInt();
		String[] str = new String[b];
		int[][] num = new int[b][a];
		for(int i =0;i<b;i++){
			str[i] = cn.next();
			for(int j =0;j<str[i].length();j++){
				for(int k =j+1;k<str[i].length();k++){
					if(str[i].charAt(j)>str[i].charAt(k))
						num[i][j]++;
				}
			}
		}
		int[] tem = new int[b];
		Arrays.fill(tem, 0);
		
		for(int i =0;i<b;i++){
			for(int j =0;j<a;j++){
				tem[i]+=num[i][j];
			}
		}
		for(int i =0;i<b;i++){
			for(int j =i+1;j<b;j++){
				if(tem[i]>tem[j]){
					String temp = str[j];
					str[j] =str[i];
					str[i] = temp;
					int z = tem[j];
					tem[j]= tem[i];
					tem[i] = z;
				}
			}
		}
		for(int i =0;i<b;i++){
			System.out.println(str[i]);
		}
	}
}
