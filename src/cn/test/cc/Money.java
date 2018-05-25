package cn.test.cc;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			double money = sc.nextDouble();
			if (money < 0)
				System.out.println("���벻�淶������������");
			else {
				BigDecimal numberOfMoney = new BigDecimal(money);
				String s = Money.number2CNMontrayUnit(numberOfMoney);
				System.out.println("��ת�ɽ��Ϊ��" + s.toString());
			}
		} catch (Exception e) {
			System.out.println("���벻�淶������������");
		}
	}

	private static final String[] CN_UPPER_NUMBER = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
	private static final String[] CN_UPPER_MONETRAY_UNIT = { "��", "��", "Ԫ", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ",
			"��", "Ǫ", "��", "ʰ", "��", "Ǫ" };

	private static final String CN_FULL = "��";

	private static final int MONEY_PRECISION = 2;

	private static final String CN_ZEOR_FULL = "��Ԫ" + CN_FULL;

	public static String number2CNMontrayUnit(BigDecimal numberOfMoney) {
		StringBuffer sb = new StringBuffer();

		int signum = numberOfMoney.signum();
		if (signum == 0) {
			return CN_ZEOR_FULL;
		}
		long number = numberOfMoney.movePointRight(MONEY_PRECISION).setScale(0, 4).abs().longValue();
		long scale = number % 100;
		int numUnit = 0;
		int numIndex = 0;
		boolean getZero = false;
		if (!(scale > 0)) {
			numIndex = 2;
			number = number / 100;
			getZero = true;
		}
		if ((scale > 0) && (!(scale % 10 > 0))) {
			numIndex = 1;
			number = number / 10;
			getZero = true;
		}
		int zeroSize = 0;
		while (true) {
			if (number <= 0) {
				break;
			}
			numUnit = (int) (number % 10);
			if (numUnit > 0) {
				if ((numIndex == 9) && (zeroSize >= 3)) {
					sb.insert(0, CN_UPPER_MONETRAY_UNIT[6]);
				}
				if ((numIndex == 13) && (zeroSize >= 3)) {
					sb.insert(0, CN_UPPER_MONETRAY_UNIT[10]);
				}
				sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
				sb.insert(0, CN_UPPER_NUMBER[numUnit]);
				getZero = false;
				zeroSize = 0;
			} else {
				++zeroSize;
				if (!(getZero)) {
					sb.insert(0, CN_UPPER_NUMBER[numUnit]);
				}
				if (numIndex == 2) {
					if (number > 0) {
						sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
					}
				} else if (((numIndex - 2) % 4 == 0) && (number % 1000 > 0)) {
					sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
				}
				getZero = true;
			}

			number = number / 10;
			++numIndex;
		}
		if (!(scale > 0)) {
			sb.append(CN_FULL);
		}
		return sb.toString();
	}
}