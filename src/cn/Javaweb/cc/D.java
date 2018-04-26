package cn.Javaweb.cc;

import java.util.Scanner;

/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月8日 下午11:06:19
 */
public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score[] score = new Score[200];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int j = 0;
		while (sc.hasNext()) {
			String name = sc.next();
			String[] ans = new String[n + 1];
			for (int i = 0; i < n; i++) {
				ans[i] = sc.next();
			}
			int ac = 0, time = 0;
			for (int i = 0; i < n; i++) {
				if (ans[i].charAt(0) == '-') {
				} else {
					if (ans[i].contains("(")) {
						ac++;
						int index = ans[i].indexOf('(');
						String s = ans[i].substring(0, index);
						int index1 = ans[i].indexOf(')');
						String s1 = ans[i].substring(index + 1, index1);
						time += Integer.parseInt(s);
						time += Integer.parseInt(s1) * m;
					} else {
						int t = Integer.parseInt(ans[i]);

						if (t != 0) {
							ac++;
							time += t;
						}
					}
				}
			}
			score[j] = new Score(name, ac, time);
			j++;
		}
		for (int k = 0; k < j; k++) {
			for (int l = k + 1; l < j; l++) {
				if (score[k].getAc() < score[l].getAc()) {
					Score tt = score[k];
					score[k] = score[l];
					score[l] = tt;
				} else if (score[k].getAc() == score[l].getAc()) {
					if (score[k].getTime() > score[l].getTime()) {
						Score tt = score[k];
						score[k] = score[l];
						score[l] = tt;
					} else if (score[k].getTime() == score[l].getTime()) {
						if (score[k].getName().compareTo(score[l].getName()) > 0) {
							Score tt = score[k];
							score[k] = score[l];
							score[l] = tt;
						}
					}
				}
			}
		}
		for (int z = 0; z < j; z++) {
			System.out.print(score[z].getName());
			int length = 10-score[z].getName().length();
			for(int k = 0;k<length;k++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			if(score[z].getAc()<10) {
				System.out.print(" ");
			}
			System.out.print(score[z].getAc());
			System.out.print(" ");
			if(score[z].getTime()<1000) {
				System.out.print(" ");
			}
			if(score[z].getTime()<100) {
				System.out.print(" ");
			}
			if(score[z].getTime()<10) {
				System.out.print(" ");
			}
			System.out.println(score[z].getTime());
		}
		sc.close();
	}
}
class Score {
	private String name;
	private int ac;
	private int time;

	public Score(String name, int ac, int time) {
		super();
		this.name = name;
		this.ac = ac;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}