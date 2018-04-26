package cn.Javaweb.cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月12日 上午8:50:39
 */
public class X {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 1;
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			if (n == 0)
				break;

			Case[] cas = new Case[1000000];
			for (int i = 0; i < n; i++) {
				String account = sc.next();
				String name = sc.next();
				String grade = sc.next();
				cas[i] = new Case(account, name, grade);
			}
			List<Case> casList = new ArrayList<Case>();
			for (int i = 0; i < n; i++) {
				casList.add(cas[i]);
			}
			if (c == 1) {
				Collections.sort(casList, new Comparator<Case>() {

					@Override
					public int compare(Case o1, Case o2) {
						return o1.getAccount().compareTo(o2.getAccount());
					}
				});

			} else if (c == 2) {
				Collections.sort(casList, new Comparator<Case>() {

					@Override
					public int compare(Case o1, Case o2) {
						if (o1.getName().compareTo(o2.getName()) == 0)
							return o1.getAccount().compareTo(o2.getAccount());
						return o1.getName().compareTo(o2.getName());
					}
				});
			} else if (c == 3) {
				Collections.sort(casList, new Comparator<Case>() {

					@Override
					public int compare(Case o1, Case o2) {
						if (o1.getGrade().compareTo(o2.getGrade()) == 0)
							return o1.getAccount().compareTo(o2.getAccount());
						return o1.getGrade().compareTo(o2.getGrade());
					}
				});
			}
			System.out.println("Case "+(m++)+":");
			for (Case s : casList) {
				System.out.println(s.getAccount() + " " + s.getName() + " " + s.getGrade());
			}
		}
		sc.close();
	}
}

class Case {
	private String account;
	private String name;
	private String grade;

	public Case(String account, String name, String grade) {
		super();
		this.account = account;
		this.name = name;
		this.grade = grade;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}