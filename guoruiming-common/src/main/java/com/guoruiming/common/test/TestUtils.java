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
 * @author 明
 * 2019年6月17日
 */
@SuppressWarnings("all")
public class TestUtils {

	static StringUtil stringUtils = new StringUtil();
	static RandomUtil randomUtils = new RandomUtil();
	
	@Test
	public void testStringUtils() {
		// 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
		boolean hasLength = stringUtils.hasLength("234");
		System.out.println("------------------------");
		System.out.println(hasLength);
		
		// 方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
		boolean hasText = stringUtils.hasText("s dg");
		System.out.println("------------------------");
		System.out.println(hasText);
		
		// 方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
		String string = stringUtils.randomChineseString(2);
		System.out.println("------------------------");
		System.out.println(string);
		
		// 方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
		String name = stringUtils.generateChineseName();
		System.out.println("------------------------");
		System.out.println(name);
	}
	
	@Test
	public void testRandomUtils() {
		// 方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
		int random = RandomUtil.random(3, 10);
		System.out.println("------------------------");
		System.out.println(random);
		
		// 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
		// (8分)
		int[] subRandom = randomUtils.subRandom(3, 10, 6);
		System.out.println("------------------------");
		for (int i : subRandom) {
			System.out.println(i);
		}
		
		// 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		char character = randomUtils.randomCharacter();
		System.out.println("------------------------");
		System.out.println(character);
		
		// 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
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
