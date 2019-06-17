package com.guoruiming.common.utils;

import java.util.Random;

/**
 * @author �� 2019��6��17��
 */
public class RandomUtil {

	// ����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max) {
		int floor = (int) Math.floor(Math.random() * (max - min - 1) + min + 1);
		return floor;
	}

	// ����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ���
	// (8��)
	public static int[] subRandom(int min, int max, int subs) {
		int num[] = new int[subs];
		for (int i = 0; i < subs; i++) {
			int r = (int) Math.floor(Math.random() * (max - min - 1) + min + 1);
			Boolean f = true;
			for (int j = 0; j < num.length; j++) {
				if (num[j] == r) {
					f = false;
					break;
				}
			}
			if (f) {
				num[i] = r;
			} else {
				i--;
			}
		}
		return num;
	}

	// ����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter() {
		String str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		int nextInt = random.nextInt(str.length());
		return str.charAt(nextInt);
	}

	// ����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length) {
		String str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(random.nextInt(str.length()));
		}
		return buffer.toString();
	}

}
