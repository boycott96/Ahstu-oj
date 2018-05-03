package cn.test12.cc;

import java.util.Scanner;

public class J1221 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String str = cn.nextLine();
		String[] dd = str.split(" ");
		System.out.println(dd.length);
		Word[] word = new Word[dd.length];
		int k = 0;
		for (int i = 0; i < dd.length; i++) {
			if (dd[i].equals("-1"))
				continue;
			else {
				String name = dd[i];
				int temp = 0;
				for (int j = i + 1; j < dd.length; j++) {
					if (dd[i].equals(dd[j])) {
						dd[j] = "-1";
						temp++;
					}
				}
				word[k]= new Word(temp+1,name);
				k++;
			}
		}
		for(int i =0;i<k;i++){
			for(int j = i+1;j<k;j++){
				if(word[i].getName().compareTo(word[j].getName())>0){
					Word zz = word[j];
					word[j] = word[i];
					word[i] = zz;
				}
			}
		}
		for (int z = 0; z < k; z++) {
			System.out.println(word[z].getName() + ":" + word[z].getTemp());
		}
	}
}

class Word {
	private int temp;
	private String name;

	public Word(int temp, String name) {
		this.name = name;
		this.temp = temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTemp() {
		return this.temp;
	}

	public String getName() {
		return this.name;
	}
}