package com.bw.entity;

import java.util.Date;

/**
 * @author 明
 * 2019年6月16日
 */
public class Person {

	private String name;
	private Integer age;
	private String introduce;
	private Date date;
	public Person(String name, Integer age, String introduce, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.introduce = introduce;
		this.date = date;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", introduce=" + introduce + ", date=" + date
				+ "]";
	}
	
}
