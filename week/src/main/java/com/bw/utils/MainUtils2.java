package com.bw.utils;

import java.util.Random;

/**
 * @author ��
 * 2019��6��15��
 */
public class MainUtils2 {

//	��ȡ��С�������������
	public static int getRandomNum(int max, int min) {
		int floor = (int) Math.floor(Math.random()*(max - min -1) + max + min + 1);
		return floor;
	}
	
//	��ȡ�� С������������ظ������
	public static int[] getRandomNums(int max, int min, int count) {
		int num[] = new int [count];
		for (int i = 0; i < count; i++) {
			int r = (int) Math.floor(Math.random() * (max - min -1) + max + min + 1);
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
	
//	�ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���) Ҳ��ûֵ
	public static Boolean isEmpty(String src) {
		if (src.length() == 0 || "".equals(src) || src == null) {
			return false;
		}
		return true;
	}
	
//	�ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)�Ϳո�Ҳ��ûֵ
	public static Boolean isTrimEmpty(String src) {
		if (src.trim().length() == 0 || "".equals(src.trim()) || src == null) {
			return false;
		}
		return true;
	}
	
//	��ȡ 1�� 1-9,a-Z֮�������ַ�
	public static char getRandomStr() {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random random = new Random();
		int nextInt = random.nextInt(str.length());
		return str.charAt(nextInt);
	}
	
//	���ز���ָ������������ַ�
	public static String getRandomStrs(int count) {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buffer.append(random.nextInt(str.length()));
		}
		return buffer.toString();
	}
	
//	����ָ���������ĺ����ַ������ַ��������� GB2312(�൱������ ����)��Χ��
	public static String getChineseCode(int count) {
		String[] lastName = {"��","��","��","˳","��","��","��","Ԫ","��",
				"��","Ϊ","��","Ҫ","ά","��","��","��","��","��","��","��",
				"��","��","��","��","��","��","��","��","��","��","��","��"};
		Random random = new Random();
		String str = "";
		for (int i = 0; i < count; i++) {
			int abs = Math.abs(random.nextInt(lastName.length));
			str = str + lastName[abs];
		}
		return str;
	}
	
//	ѡ����
	public static String getChineseName(int count) {
		String[] string = {"��","Ǯ","��","��","��","��","֣","��","��",
				"��","��","��","��","��","��","��","��","��","��","��","��",
				"��","ʩ","��","��","��","��","��"};
		Random random = new Random();
		int abs = Math.abs(random.nextInt(string.length));
		String name = string[abs];
		String chineseCode = MainUtils2.getChineseCode(count);
		return chineseCode + name;
	}
}
