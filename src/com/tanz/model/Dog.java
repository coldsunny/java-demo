package com.tanz.model;

/**
 * 宠物狗类，继承自Animal类
 * @author tanz
 * @version 创建时间 ：2019年4月8日 
 */

public class Dog extends Animal{
	/** 
	 * 成员属性
	 */
	private String name;
	private int age;
	private double weight;
	private String adress;
	
	/**
	 * 静态属性
	 */
	public static int st3=39;
		
	static{
		/**
		 * 静态代码块
		 */
		System.out.println("我是子类的静态代码块");
	}
	
	{
		/**
		 * 构造代码块
		 */
		System.out.println("我是子类的构造代码块");
	}
	
	public Dog() {
		/** 
		 * 无参构造方法
		 */
		System.out.println("我是子类的无参构造方法");
	}
	
	public Dog(String name, int age) {
		/**
		 * 带参构造方法
		 * @param name
		 * @param age
		 * @param weight
		 * @param adress
		 */
//	 super(name,age);
	 this.setName(name);
	 this.setAge(age);
	 System.out.println("我是子类的带参构造方法");
	 }
	
	public void setName(String name) {
		/** 
		 * 添加setter和getter方法
		 * @param name
		 */
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age <= 0)
			System.out.println("请输入正确的年龄");
		else
			this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	/** 
	 * 成员方法
	 */
	public void say() {
		System.out.println("小狗汪汪");
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		super.eat();
	}
	
	public void run(String name) {
		System.out.println(name+"跑的好快！");
	}
}
