package cn.test11.cc;

import java.util.Scanner;
//��ӡ�������
public class J1125 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){//�ж϶�������
			int n = cn.nextInt();
			int[][] a = new int[20][20];
			a[0][0] = 1;//��ʼ������
			a[1][0] = 1;
			a[1][1] = 1;
			for(int i =2;i<n;i++){//�Ժ���������
				for(int j=1;j<=i-1;j++){
					a[i][j] = a[i-1][j-1]+a[i-1][j];
				}
				a[i][0] =1;
				a[i][i] =1;//��ʼ����βΪһ
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++){
					System.out.print(a[i][j]);
					if(j<i) System.out.print(" ");//���ƿո�����
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
