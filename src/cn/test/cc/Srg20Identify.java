package cn.test.cc;

import java.util.Scanner;

public class Srg20Identify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�Ǽ�����Ϣ");
			System.out.println("2.��ʾ�ѵǼ���Ϣ");
			System.out.println("3.�����ѵǼ���Ϣ");
			System.out.println("4.�޸��ѵǼ���Ϣ");
			System.out.println("5.����ϵͳ���ݿ�");
			System.out.println("0.�˳�ϵͳ");
			System.out.println("---------------");
			System.out.println("������һ�����֣�ѡ��һ�����ܣ�");
			int in = sc.nextInt();
			if(in == 0) {
				System.out.println("ллʹ�ã�ϵͳ�����˳�");
				break;
			}
		}
		sc.close();
	}
}
