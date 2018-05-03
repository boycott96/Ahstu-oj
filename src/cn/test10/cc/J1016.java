package cn.test10.cc;

public class J1016 {
	public static void main(String[] args) {
		//利用多重循环进行判断 
		for(int a=1;a>=0;a--)
		for(int b=1;b>=0;b--)
		for(int c=1;c>=0;c--)
		for(int d=1;d>=0;d--)
		for(int e=1;e>=0;e--)
		for(int f=1;f>=0;f--){
			if(a+b>=1&&a+d<=1&&a+e+f==2&&(b+c==2||b+c==0)&&c+d==1&&(d+e==0||d==1)){
				if(a==1) System.out.print("A");
				if(b==1) System.out.print(",B");
				if(c==1) System.out.print(",C");
				if(d==1) System.out.print(",D");
				if(e==1) System.out.print(",E");
				if(f==1) System.out.print(",F");
				
			}
		}
	}
}
