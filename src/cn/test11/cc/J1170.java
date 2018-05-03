package cn.test11.cc;

import java.util.Scanner;

public class J1170 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int m = cn.nextInt();
		int n = cn.nextInt();
		Poly[] po = new Poly[m+n];
		for (int i = 0; i < n+m; i++) {
			int coe = cn.nextInt();
			int exp = cn.nextInt();
			po[i] = new Poly(coe, exp);
		}
		for(int i =0;i<n+m;i++){
			for(int j = i+1;j<n+m;j++){
				if(po[i].getExp()<po[j].getExp()){
					Poly pl = po[j];
					po[j] = po[i];
					po[i] =pl;
				}else if(po[i].getExp()==po[j].getExp()){
					po[i].setCoe(po[i].getCoe()+po[j].getCoe());
					po[j].setCoe(0);
				}
			}
		}
		for(int i = 0;i<n+m;i++){
			if(po[i].getCoe()==0) continue;
			System.out.println(po[i].getCoe()+" "+po[i].getExp());
		}
	}
}

class Poly {
	private int Exp;
	private int Coe;

	public Poly(int Coe, int Exp) {
		this.Exp = Exp;
		this.Coe = Coe;
	}
	
	public void setExp(int Exp){
		this.Exp = Exp;
	}
	public void setCoe(int Coe){
		this.Coe = Coe;
	}

	public int getExp() {
		return this.Exp;
	}

	public int getCoe() {
		return this.Coe;
	}
}