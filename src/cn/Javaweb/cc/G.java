package cn.Javaweb.cc;

import java.util.Scanner;
/**
 * 
 * @author SunnyBoy
 * @version Time：2018年3月9日 下午10:07:23
 */
public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regex = "[^a-zA-Z]";
		String[] data = str.split(regex);
		for(int i = 0;i<data.length;i++) {
			if(data[i].equals(""))
				continue;
			System.out.println(data[i]);
		}
		sc.close();
	}
}
