package cn.test10.cc;

import java.util.Scanner;

public class J1005 {
	private static boolean first;//设置成员变量
	private static int a;
	private static int b;

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while(cn.hasNext()){
			int n = cn.nextInt();
			while(n--!=0){
				a = cn.nextInt();
				b = cn.nextInt();
				first = true;//初始化first值
				while(b--!=0){	//判断b是否为零，如果不是则将打印，并将first初始化为false
					prin();
					first = false;
				}
				System.out.println("");
			}
		}
		cn.close();
	}

	private static void prin() { //打印完整的DNA格式
		int i;
		if(first){	//对first进行判断，打印除第一行的第一个X，和最后一个X，以及中间的空格
			System.out.print("X");
			printSpace(a- 2);
			System.out.println("X");
		}
		for(i=1;i<a/2;i++){	//对不是第一行和中间一行的其余行进行打印
			printSpace(i);
			System.out.print("X");
			printSpace(-2*i+a-2);
			System.out.println("X");
		}printSpace(i);//对中间的一行打印i个空格（i来自于上面循环的a/2）
		System.out.println("X");//打印最中间一行X
		for(int j =0;j<a/2;j++,i--){	//同一个for循环打印X
			printSpace(i-1);
			System.out.print("X");
			printSpace(j*2+1);
			System.out.println("X");
		}
	}

	private static void printSpace(int i) {	 //用来判断打印空格的个数
		while(i!=0&&(i--)!=0){
			System.out.print(" ");
		}
	}
}
