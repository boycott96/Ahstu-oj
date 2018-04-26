package cn.Javaweb.cc;

public class Z {
	public static void main(String[] args) {
		for(int i = 100;i<=200;i++) {
			if(i==107||i==127) continue;
			if(isPrime(i)) {
				System.out.println(i);
			}
//			BigInteger z = new BigInteger(Integer.toString(i));
//			if(z.isProbablePrime(i)) {
//				System.out.println(z);
//			}
		}
	}
	public static boolean isPrime(int a) {
		if(a==2) return true;
		if(a<2||a%2==0) return false;
		for(int m = 3;m<=Math.sqrt(a);m+=2) {
			if(a% m ==0) {
				return false;
			}
		}
		return true;
		
	}
}
