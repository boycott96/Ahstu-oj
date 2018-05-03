package cn.test11.cc;

import java.util.Scanner;

public class J1155 {
	static int[] a = new int[6];

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		String[] s = new String[6];
		for (int i = 0; i < 4; i++)
			s[i] = cn.next();
		for (int i = 0; i < 4; i++) {
			if (s[i] == "A")
				a[i] = 1;
			else if (s[i] == "J")
				a[i] = 11;
			else if (s[i] == "Q")
				a[i] = 12;
			else if (s[i] == "K")
				a[i] = 13;
			else{
				char c = s[i].charAt(0);
				a[i] = c-'0';
			}
		}
		if(pointTF(0))
			System.out.println("Y");
		else 
			System.out.println("N");
	}

	public static boolean pointTF(int x) {
		if (x == 3) {
			if (24 == a[x])
				return true;
			return false;
		}
		for (int i = x; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				int le = a[i], ri = a[j];
				a[i] = a[x];
				a[j] = le + ri;
				if (pointTF(x + 1))
					return true;
				a[j] = le - ri;
				if (pointTF(x + 1))
					return true;
				a[j] = le*ri;
				if(pointTF(x+1))
					return true;
				a[j] = ri-le;
				if(pointTF(x+1))
					return true;
				if(ri!=0&&le%ri==0){
					a[j] = le/ri; 
					if(pointTF(x+1)) 
						return true;
				}
				if(le!=0&&ri%le==0){
					a[j]=ri/le;
					if(pointTF(x+1))
						return true;
				}
				a[i] = le;
				a[j] = ri;
			}
		}
		return false;
	}
}
