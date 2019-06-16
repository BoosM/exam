package com.bw.test;

import org.junit.Test;

import com.bw.utils.MainUtils;

/**
 * @author 明
 * 2019年6月15日
 */
@SuppressWarnings("static-access")
public class TestMainUtils {

	static MainUtils mainUtils = new MainUtils();
	
	@Test
	public void testGetRandom() {
		int random = mainUtils.getRandom(10, 3);
		System.out.println(random);
	}
	
	@Test
	public void testGetRandoms() {
		int[] random = mainUtils.getRandoms(10, 3, 6);
		for (int i : random) {
			System.out.println(i);
		}
	}
	
	@Test
	public void testIsEmpty() {
		Boolean empty = mainUtils.isEmpty("dds");
		System.out.println(empty);
	}
	
	@Test
	public void testIsTrimEmpty() {
		Boolean empty = mainUtils.isEmpty("    ");
		System.out.println(empty);
	}
	
	@Test
	public void testGetRandomStr() {
		char randomStr = mainUtils.getRandomStr();
		System.out.println(randomStr);
	}
	
	@Test
	public void testGetRandomCode() {
		String randomCode = mainUtils.getRandomCode(6);
		System.out.println(randomCode);
	}
	
	@Test
	public void testGetRandomChineseCode() {
		String chineseCode = mainUtils.getChineseCode(2);
		System.out.println(chineseCode);
	}
	
	@Test
	public void testGetRandomChineseName() {
		String ChineseName = mainUtils.getChineseName(1);
		System.out.println(ChineseName);
	}
	
}
