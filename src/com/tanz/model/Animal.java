package com.tanz.model;

/**
 * 动物类
 * @author Administrator
 * @vertion 创建时间：2019年4月8日
 */

//public final class Animal/final public class Animal都可以
  public class Animal{
	/**
	 * 成员属性
	 */
	private String name="妮妮";
	private int age=2;
	private String species="动物";
	public static final int temp=12;
	
	/**
	 * 静态属性
	 */
	public static int st1=10;
	public static int st2=22;
		
	static{
		/**
		 * 静态代码块
		 */
		System.out.println("我是父类的静态代码块");
	}
	
	{
		/**
		 * 构造代码块
		 */
		System.out.println("我是父类的构造代码块");
	}
	
	public Animal(){
		/**
		 * 无参构造方法
		 */
		age=3;
		System.out.println("我是父类的无参构造方法");
	}
	
	
	public Animal(String name,int age){
		/**
		 * 带参构造方法
		 */
		this.name=name;
		this.age=age;
		System.out.println("我是父类的带参构造方法");
	}
	
	/**
	 * 添加setter和getter方法
	 */
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	/**
	 * 成员方法
	 */
	public void eat() {
		final int temp=10;//方法内的局部变量
//		temp=12;
		System.out.println(this.name+"在吃东西");
	}

	public  void run() {
		System.out.println("动物可以跑");
	}
	
	public static void sleep() {
		/**
		 * 静态方法
		 */
		System.out.println("动物要睡觉");
	}
	
	//object类的equals方法重写
	public boolean equals(Object obj){
		if (obj==null)
			return false;
		Animal temp=(Animal)obj;
		if(this.getName().equals(temp.getName()) && this.getAge()==temp.getAge())
			return true;
		else
			return false;		
	}
	
	//对Animal中的equals方法进行重载
	public boolean equals(Animal obj){
		if (obj==null)
			return false;
		if(this.getName().equals(obj.getName()) && this.getAge()==obj.getAge())
			return true;
		else
			return false;
	}
	
	//对Object类中toString方法重写
	public String toString(){
		return "昵称:"+this.getName()+";年龄:"+this.getAge();
	}
}
