package com.tanz.model;

/**
 * 泛型
 */

public class FanXing<T>{
	private T name;
	private T age;
	
	public FanXing(){
		
	}
	public FanXing(T name,T age){
		this.getName();
		this.getAge();
		System.out.println("name:"+name+",age:"+age);
	}

	public T getName(){
		return name;
	}
	public void setName(T name){
		this.name=name;
	}

	public T getAge() {
		return age;
	}

	public void setAge(T age) {
		this.age = age;
	}
	

}
