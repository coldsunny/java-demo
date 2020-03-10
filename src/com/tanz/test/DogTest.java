package com.tanz.test;

import com.tanz.model.Dog;

public class DogTest {
	public static void main(String[] args) {
		Dog one = new Dog("小黑", 3);
		one.run("小白");
		System.out.println(one.getName() + "的年龄是：" + one.getAge() + "岁");
	}

}
