package com.tanz.model;

public class Cat extends Animal {
	int num = 70;
	static int age = 80;
	String name = "bobo";

	public void eat() {
		System.out.println("猫要吃饭");
	}

	public static void sleep() {
		System.out.println("猫要睡觉");
	}

	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
