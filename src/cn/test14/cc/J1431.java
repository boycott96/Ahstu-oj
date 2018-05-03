package cn.test14.cc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class J1431 {
	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		int z = cn.nextInt();
		while (z-- > 0) {
			//圆心的坐标
			double a = cn.nextDouble();
			double b = cn.nextDouble();
			//圆的半径
			double r = cn.nextDouble();
			//圆外的一点A的坐标
			double x_1 = cn.nextDouble();
			double y_1 = cn.nextDouble();
			//角速度和时间
			double w = cn.nextDouble();
			double t = cn.nextDouble();
			//圆上的B点的坐标
			double x_2 = a + r * Math.cos(w * t), y_2 = b + r * Math.sin(w * t);
			//直线的A B C
			double m_1 = y_1 - y_2, m_2 = x_2 - x_1, m_3 = x_1*y_2-x_2*y_1;
			//圆心到直线的距离
			double d = Math.abs(a * m_1 + b * m_2 + m_3) / Math.sqrt(Math.pow(m_1, 2) + Math.pow(m_2, 2));
			//截取的线段长度
			double result = 2 * Math.sqrt(Math.pow(r, 2) - Math.pow(d, 2));
			DecimalFormat df = new DecimalFormat("#####0.00");
			String s = df.format(result);
			System.out.println(s);
		}
	}
}
