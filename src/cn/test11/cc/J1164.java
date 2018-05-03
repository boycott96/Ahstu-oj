package cn.test11.cc;

import java.util.Scanner;

public class J1164 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		Phone[] ph = new Phone[100];
		int i =0;
		while(cn.hasNext()){
			int type = cn.nextInt();
			String str = cn.next();
			ph[i] = new Phone(type,str);
			i++;
		}
		String[][] sh = new String[10][3];
		for(int z =0;z<10;z++){
			for(int y = 0;y<3;y++){
				sh[z][y] = "0";
			}
		}
		int j=0,l=0,h=0;
		for(int k= i-1;k>=0;k--){
			if(ph[k].getType()==0){
				sh[j][0] = ph[k].getNumber();
				j++;
			}
			if(ph[k].getType()==1){
				sh[l][1] = ph[k].getNumber();
				l++;
			}
			if(ph[k].getType()==2){
				sh[h][2] = ph[k].getNumber();
				h++;
			}
		}
		for(int z =0 ;z<10;z++){
			for(int y = 0;y<3;y++){
				if(y<2) System.out.print(sh[z][y]+" ");
				else System.out.print(sh[z][y]);
			}
			System.out.println();
		}
		cn.close();
	}
}

class Phone {
	private int type;
	private String number;
	public Phone(int type,String number){
		this.type = type;
		this.number = number;
	}
	public int getType(){
		return this.type;
	}
	public String getNumber(){
		return this.number;
	}
}