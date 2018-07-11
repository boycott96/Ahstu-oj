package cn.test.cc;

import java.util.Scanner;

public class Srg20Identify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.登记新信息");
			System.out.println("2.显示已登记信息");
			System.out.println("3.查找已登记信息");
			System.out.println("4.修改已登记信息");
			System.out.println("5.黑入系统数据库");
			System.out.println("0.退出系统");
			System.out.println("---------------");
			System.out.println("请输入一个数字，选择一个功能：");
			int in = sc.nextInt();
			if(in == 0) {
				System.out.println("谢谢使用，系统正常退出");
				break;
			}
		}
		sc.close();
	}
}
