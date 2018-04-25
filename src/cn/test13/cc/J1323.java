package cn.test13.cc;

import java.util.Scanner;

public class J1323 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		Brother[] br = new Brother[n];
		for(int i =0;i<n;i++){
			String name = cn.next();
			int year = cn.nextInt();
			int month = cn.nextInt();
			int day = cn.nextInt();
			br[i] = new Brother(name, year, month, day);
		}
		for(int i =0;i<n-1;i++){
			for(int j = i+1;j<n;j++){
				if(br[i].getYear()>br[j].getYear()){
					Brother bb = br[j];
					br[j] = br[i];
					br[i] = bb;
				}else if(br[i].getYear()==br[j].getYear()){
					if(br[i].getMonth()>br[j].getMonth()){
						Brother bb = br[j];
						br[j] = br[i];
						br[i] = bb;
					}else if(br[i].getMonth()==br[j].getMonth()){
						if(br[i].getDay()>br[j].getDay()){
							Brother bb = br[j];
							br[j] = br[i];
							br[i] = bb;
						}
					}
				}
			}
		}
		for(int i =0;i<n;i++){
			System.out.println(br[i].getName());
		}
		cn.close();
	}
}
class Brother{
	private String name;
	private int year;
	private int month;
	private int day;
	     
	public Brother(String name, int year, int month, int day) {
		super();
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Brother() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}