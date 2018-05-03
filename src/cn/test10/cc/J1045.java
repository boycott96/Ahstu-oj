package cn.test10.cc;

public class J1045 {
	public static void main(String[] args) {
		int z=0;
		for(int i = 0;i<=4;i++){
			for(int j =0;j<=3;j++){
				z++;
			}
		}
		int number = z-1;//去掉两张邮票同时为零的情况
		System.out.println(number);
		
	}
}
