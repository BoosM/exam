package com.guoruiming.common.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.guoruiming.common.java.Person;
import com.guoruiming.common.utils.RandomUtil;
import com.guoruiming.common.utils.StringUtil;

/**
 * @author ��
 * 2019��6��17��
 */
@SuppressWarnings("all")
public class TestUtils {

	static StringUtil stringUtils = new StringUtil();
	static RandomUtil randomUtils = new RandomUtil();
	
	@Test
	public void testStringUtils() {
		// ����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
		boolean hasLength = stringUtils.hasLength("234");
		System.out.println("------------------------");
		System.out.println(hasLength);
		
		// ����2���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)�Ϳո�Ҳ��ûֵ (5��)
		boolean hasText = stringUtils.hasText("s dg");
		System.out.println("------------------------");
		System.out.println(hasText);
		
		// ����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
		String string = stringUtils.randomChineseString(2);
		System.out.println("------------------------");
		System.out.println(string);
		
		// ����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
		String name = stringUtils.generateChineseName();
		System.out.println("------------------------");
		System.out.println(name);
	}
	
	@Test
	public void testRandomUtils() {
		// ����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
		int random = RandomUtil.random(3, 10);
		System.out.println("------------------------");
		System.out.println(random);
		
		// ����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ���
		// (8��)
		int[] subRandom = randomUtils.subRandom(3, 10, 6);
		System.out.println("------------------------");
		for (int i : subRandom) {
			System.out.println(i);
		}
		
		// ����3������1��1-9,a-Z֮�������ַ��� (8��)
		char character = randomUtils.randomCharacter();
		System.out.println("------------------------");
		System.out.println(character);
		
		// ����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
		String randomString = randomUtils.randomString(6);
		System.out.println("------------------------");
		System.out.println(randomString);
	}
	
	@Test
	public void testPerson() throws ParseException {
		List<Person> list = new ArrayList<Person>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		for (int i = 0; i < 10000; i++) {
			list.add(new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), StringUtil.randomChineseString(140), sdf.parse(RandomUtil.random(20100101, 20190617)+"")));
		}
		
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
