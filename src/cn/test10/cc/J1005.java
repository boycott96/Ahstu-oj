package cn.test10.cc;

import java.util.Scanner;

public class J1005 {
	private static boolean first;//���ó�Ա����
	private static int a;
	private static int b;

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			while(n--!=0){
				a = cn.nextInt();
				b = cn.nextInt();
				first = true;//��ʼ��firstֵ
				while(b--!=0){	//�ж�b�Ƿ�Ϊ�㣬��������򽫴�ӡ������first��ʼ��Ϊfalse
					prin();
					first = false;
				}
				System.out.println("");
			}
		}
		cn.close();
	}

	private static void prin() { //��ӡ������DNA��ʽ
		int i;
		if(first){	//��first�����жϣ���ӡ����һ�еĵ�һ��X�������һ��X���Լ��м�Ŀո�
			System.out.print("X");
			printSpace(a- 2);
			System.out.println("X");
		}
		for(i=1;i<a/2;i++){	//�Բ��ǵ�һ�к��м�һ�е������н��д�ӡ
			printSpace(i);
			System.out.print("X");
			printSpace(-2*i+a-2);
			System.out.println("X");
		}printSpace(i);//���м��һ�д�ӡi���ո�i����������ѭ����a/2��
		System.out.println("X");//��ӡ���м�һ��X
		for(int j =0;j<a/2;j++,i--){	//ͬһ��forѭ����ӡX
			printSpace(i-1);
			System.out.print("X");
			printSpace(j*2+1);
			System.out.println("X");
		}
	}

	private static void printSpace(int i) {	 //�����жϴ�ӡ�ո�ĸ���
		while(i!=0&&(i--)!=0){
			System.out.print(" ");
		}
	}
}
