package cn.Javaweb.cc;

import java.util.Scanner;

public class L {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[] ch = { "N", "C", "O", "Cl", "S", "H", "Al", "Ca", "Zn", "Na", "B", "Ni" };
		//int[] in = { 14, 12, 16, 35, 32, 2, 27, 40, 65, 23, 11, 59 };
		//List<String> listch = new ArrayList<>();
		//for (int i = 0; i < ch.length; i++) {
			//listch.add(ch[i]);
		//}
		int k = sc.nextInt();
		while (k-- > 0) {
			int num1 = 1,num2 = 0,pri=1,par = 0;
			boolean f = false;
			String str = sc.next();
			int len = str.length();
			int index =str.indexOf("=")+1;
			while(index!=len&&str.charAt(index)!='+') {
				if(str.charAt(index)=='(') f = true;
				if(str.charAt(index)==')') f = false;
				if(str.charAt(index-1)=='='&&Character.isDigit(str.charAt(index))) num1 = str.charAt(index)-'0';
				else if(Character.isDigit(str.charAt(index))) {
					if(f) par += pri*(str.charAt(index)-'0'-1);
					else if(!f&&str.charAt(index-1)==')') par += par*(str.charAt(index)-'0'-1);
					else num2+=pri*(str.charAt(index)-'0'-1);
				}
				else {
					if(str.charAt(index)=='N') {
						if(index!=len-1&&str.charAt(index+1)=='a') pri =23;
						else if(index!=len-1&&str.charAt(index+1)=='i') pri = 59;
						else pri= 14;
					}else if(str.charAt(index)=='C') {
						if(str.charAt(index+1)=='a') pri = 40;
						else if(index!=len-1&&str.charAt(index+1)=='l') pri = 35;
						else pri = 12;
					}else if(str.charAt(index)=='O') pri = 16;
					else if(str.charAt(index)=='S') pri = 32;
					else if(str.charAt(index)=='H') pri = 2;
					else if(str.charAt(index)=='A') pri = 27;
					else if(str.charAt(index)=='Z') pri = 65;
					else if(str.charAt(index)=='B') pri = 11;
					else {
						if(f) par-=pri;
						else num2-=pri;
					}
					if(f) par +=pri;
					else num2+=pri;
				}
				index++;
			}
			System.out.println(String.format("%04d", num1*(par+num2)));
		}
		sc.close();
	}
}
//			int sum = 0;
//			String newstr = str.substring(index + 1);
//			int endindex = newstr.indexOf("+");
//			String newstr1 = "";
//			if (endindex > 0) {
//				newstr1 = newstr.substring(0, endindex);
//			}
//			if (!newstr1.isEmpty()) {
//				newstr = newstr1;
//			}
//			String[] strr = newstr.split("\\(");
//			int j = 0;
//			while (Character.isDigit(strr[0].charAt(j))) {
//				j++;
//			}
//			int temp = 1;
//			if (j > 0) {
//				temp = Integer.parseInt(strr[0].substring(0, j));
//			}
//
//			for (String str1 : strr) {
//				sum += judge(str1, listch, in);
//			}
//			sum *= temp;
//			System.out.println(String.format("%04d", sum));
//		}
//		sc.close();
//	}
//
//	private static int judge(String str1, List<String> listch, int[] in) {
//		int j = 0, count = 0, daxie = 0;
//		while (Character.isDigit(str1.charAt(j))) {
//			j++;
//		}
//		for (int i = j; i < str1.length(); i++) {
//			if (i != str1.length() - 1 && Character.isLowerCase(str1.charAt(i + 1))) {
//				String newstr = str1.substring(i, i + 2);
//				int index = listch.indexOf(newstr);
//				count += in[index];
//				i++;
//			} else if (Character.isUpperCase(str1.charAt(i))) {
//				String newstr = str1.substring(i, i + 1);
//				int index = listch.indexOf(newstr);
//				count += in[index];
//				daxie = in[index];
//			} else if (Character.isDigit(str1.charAt(i))) {
//				int t = Integer.parseInt(str1.substring(i, i + 1));
//				if (Character.isUpperCase(str1.charAt(i - 1))) {
//					daxie *= t - 1;
//					count += daxie;
//				} else {
//					count *= t;
//				}
//			}
//		}
//		return count;
//	}

