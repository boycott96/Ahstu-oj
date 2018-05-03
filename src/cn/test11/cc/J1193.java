package cn.test11.cc;

import java.util.Scanner;

public class J1193 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		Students[] stu = new Students[1000];
		int i = 0;
		int t = n;
		while (t-- > 0) {
			String str = cn.next();
			int date = cn.nextInt();
			int data = cn.nextInt();
			String classMat = cn.next();
			String loca = cn.next();
			int math = cn.nextInt();
			stu[i] = new Students(str, date, data, classMat, loca, math);
			i++;
		}
		for (int j = 0; j < n; j++) {
			int score = 0;
			score += score1(stu[j].getDate(), stu[j].getMath());
			score += score2(stu[j].getDate(), stu[j].getData());
			score += score3(stu[j].getDate());
			score += score4(stu[j].getDate(), stu[j].getLoca());
			score += score5(stu[j].getData(), stu[j].getClassMat());
			stu[j].setScore(score);
		}
		int max = 0, sum = 0;
		for (int j = 0; j < n; j++) {
			if (max < stu[j].getScore())
				max = stu[j].getScore();
			sum += stu[j].getScore();
		}
		for (int j = 0; j < n; j++) {
			if (stu[j].getScore() == max) {
				System.out.println(stu[j].getName());
				System.out.println(stu[j].getScore());
				System.out.println(sum);
				break;
			}
		}
		cn.close();
	}

	private static int score5(int data, String classMat) {
		if (data > 80 && classMat.equals("Y"))
			return 850;
		return 0;
	}

	private static int score4(int date, String loca) {
		if (date > 85 && loca.equals("Y"))
			return 1000;
		return 0;
	}

	private static int score3(int date) {
		if (date > 90)
			return 2000;
		return 0;
	}

	private static int score2(int date, int data) {
		if (date > 85 && data > 80)
			return 4000;
		return 0;
	}

	private static int score1(int date, int math) {
		if (date > 80 && math >= 1)
			return 8000;
		return 0;
	}
}

class Students {
	private String name;
	private int date;
	private int data;
	private String classMat;
	private String loca;
	private int math;
	private int score;

	public Students(String name, int date, int data, String classMat,
			String loca, int math) {
		this.name = name;
		this.date = date;
		this.data = data;
		this.classMat = classMat;
		this.loca = loca;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getClassMat() {
		return classMat;
	}

	public void setClassMat(String classMat) {
		this.classMat = classMat;
	}

	public String getLoca() {
		return loca;
	}

	public void setLoca(String loca) {
		this.loca = loca;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}