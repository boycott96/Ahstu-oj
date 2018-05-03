package cn.test11.cc;  

import java.util.Scanner;

public class J1132 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		while (cn.hasNext()) {
			double[] a = new double[7];
			for(int i =0;i<7;i++){
				a[i] = cn.nextDouble();
			}
			String name= cn.next();
			double sum = 0, min = a[0], max = a[0];
			for (int i = 0; i < 7; i++) {
				sum += a[i];
				if (min > a[i])
					min = a[i];
				if (max < a[i])
					max = a[i];
			}

			Score score = new Score();
			score.sum = sum - min - max;
			score.str = name;
			System.out.printf("%s %.2f\n", score.getName(), score.getScore());
		}
		cn.close();
	}
}

class Score {
	String str;
	double sum;
	public Score() {

	}
	public double getScore() {
		return 1.0 * sum / 5;
	}

	public String getName() {
		return str;
	}
}
