package cn.test11.cc;
import java.util.Scanner;

public class J1148 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int n = cn.nextInt();
		int m = cn.nextInt();
		Student[] s = new Student[6];
		int k = 0;
		while (cn.hasNext()) {
			int A = 0;
			int B = 0;
			int C = 0;
			String na = cn.next();
			for (int j = 0; j < n; j++) {
				String nb = cn.next();
				if (nb.startsWith("-")) {
					
					int temp = Integer.parseInt(nb);
					B += Math.abs(temp);
				} else if (nb.endsWith(")")) {
					int v = nb.indexOf("(");
					int length = nb.length();
					String z1 = "";
					String z2 = "";
					for (int l = 0; l < v; l++) {
						z1 += nb.charAt(l);
					}
					for (int l = v + 1; l < length - 1; l++) {
						z2 += nb.charAt(l);
					}
					int temp1 = Integer.parseInt(z1);
					int temp2 = Integer.parseInt(z2);
					A++;
					B += temp2;
					C += temp1;
				} else if (nb.equals("0")) {
					continue;
				} else {
					int temp3 = Integer.parseInt(nb);
					A++;
					C += temp3;
				}
			}
			s[k] = new Student(na, A, B * m + C);
			k++;
		}
		for (int i = 0; i < k; i++) {
			for (int j = i; j < k; j++) {
				if (s[i].getAC() < s[j].getAC()) {
					Student te = s[i];
					s[i] = s[j];
					s[j] = te;
				} else if (s[i].getAC() == s[j].getAC()) {
					if (s[i].getB() > s[j].getB()) {
						Student te = s[i];
						s[i] = s[j];
						s[j] = te;
					}
					else if(s[i].getB()==s[j].getB()){
						if(s[i].getName().compareTo(s[j].getName())>0){
							Student t = s[i];
							s[i] = s[j];
							s[j] = t;
						}
					}
				}
			}
		}
		for (Student as : s) {
			System.out.println(as);
		}
		cn.close();
	}
}

class Student {
	private String name;
	private int a;
	private int b;

	public Student(String name, int a, int b) {
		this.name = name;
		this.a = a;
		this.b = b;
	}
	public String getName(){
		return this.name;
	}

	public int getAC() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

	public String toString() {
		return name + " " + this.a + " " + this.b;
	}

}
