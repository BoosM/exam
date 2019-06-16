package com.bw.utils;

import java.util.Random;

/**
 * @author 明
 * 2019年6月15日
 */
public class MainUtils {

//	获取最小最大区间的随机数
	public static int getRandom(int max, int min) {
		int floor = (int) Math.floor(Math.random() * (max - min -1) + min + 1);
		return floor;
	}
	
//	获取最 小最大区间多个不重复随机数
	public static int[] getRandoms(int max, int min, int count) {
		int arr [] = new int [count];
		for (int i = 0; i < count; i++) {
			int r = (int) Math.floor(Math.random() * (max - min -1) + min + 1);
			Boolean f = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == r) {
					f = false;
					break;
				}
			}
			if (f) {
				arr[i] = r;
			} else {
				i--;
			}
		}
		return arr;
	}
	
//	判断源字符串是否有值，空引号(空白字符串) 也算没值
	public static Boolean isEmpty(String src) {
		if (src.length() == 0 || "".equals(src) || src == null ) {
			return false;
		}
		return true;
	}
	
//	判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static Boolean isTrimEmpty(String src) {
		if (src.trim().length() == 0 || "".equals(src.trim()) || src == null ) {
			return false;
		}
		return true;
	}
	
//	获取 1个 1-9,a-Z之间的随机字符
	public static char getRandomStr() {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random random = new Random();
		int nextInt = random.nextInt(61);
		return str.charAt(nextInt);
	}
	
//	返回参数指定个数的随机字符
	public static String getRandomCode(int count) {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buffer.append(str.charAt(random.nextInt(61)));
		}
		return buffer.toString();
	}
	
//	③返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文 简体)范围内
	public static String getChineseCode(int n) {
		String[] lastName = {"按","增","加","顺","序","返","回","元","素",
				"因","为","需","要","维","护","插","入","但","迭","代","访",
				"问","会","有","好","性","能","华","采","用","链","表","内"};
		Random random = new Random();
		String str = "";
		for (int i = 0; i < n; i++) {
			int abs = random.nextInt(lastName.length);
			str = str + lastName[abs];
		}
		return str;
	}
	
//	选名器
	public static String getChineseName(int n) {
		String[] string = {"赵","钱","孙","李","周","吴","郑","王","冯",
				"陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许","何",
				"吕","施","张","孔","曹","严","华"};
		Random random = new Random();
		int abs = Math.abs(random.nextInt(string.length));
		String string2 = string[abs];
		String chineseCode = MainUtils.getChineseCode(n);
		return string2 + chineseCode;
	}
}
