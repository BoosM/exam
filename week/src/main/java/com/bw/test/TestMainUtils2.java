package com.bw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.bw.entity.Person;
import com.bw.utils.MainUtils2;

/**
 * @author 明
 * 2019年6月15日
 */
@SuppressWarnings("static-access")
public class TestMainUtils2 {

	static MainUtils2 mainUtils2 = new MainUtils2();
	
	@Test
	public void testGetRandom() {
		int random = mainUtils2.getRandomNum(10, 3);
		System.out.println(random);
	}
	
	@Test
	public void testGetRandoms() {
		int[] random = mainUtils2.getRandomNums(3, 10, 6);
		for (int i : random) {
			System.out.println(i);
		}
	}
	
	@Test
	public void testIsEmpty() {
		Boolean empty = mainUtils2.isEmpty(null);
		System.out.println(empty);
	}
	
	@Test
	public void testIsTrimEmpty() {
		Boolean empty = mainUtils2.isTrimEmpty(null);
		System.out.println(empty);
	}
	
	@Test
	public void testGetRandomStr() {
		char randomStr = mainUtils2.getRandomStr();
		System.out.println(randomStr);
	}
	
	@Test
	public void testGetRandomCode() {
		String randomCode = mainUtils2.getRandomStrs(6);
		System.out.println(randomCode);
	}
	
	@Test
	public void testGetRandomChineseCode() {
		String chineseCode = mainUtils2.getChineseCode(2);
		System.out.println(chineseCode);
	}
	
	@Test
	public void testGetRandomChineseName() {
		String ChineseName = mainUtils2.getChineseName(2);
		System.out.println(ChineseName);
	}
	
//	在 Maven 的测试包中测试所编写的工具方法，
//	具体是批量生成 1 万个 Person 对象(姓名、年龄、介绍、生成日期等等)，要求使用到上述方法。 

	@Test
	public void testPerson() throws ParseException {
		List<Person> list = new ArrayList<Person>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		随机生成一万个person对象
		for (int i = 0; i < 10000; i++) {
			list.add(new Person(mainUtils2.getChineseName(2), mainUtils2.getRandomNum(99, 1),
				mainUtils2.getChineseCode(100), sdf.parse(mainUtils2.getRandomNum(20000201, 20000228)+"")));
		}
		
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
