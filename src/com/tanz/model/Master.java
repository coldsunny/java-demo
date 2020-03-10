package com.tanz.model;

/**
 * 主人类
 * 喂猫咪：
 * 喂狗狗：
 * @author Administrator
 */
public class Master {
//	方案1
//	public void feed(Cat cat){
//		cat.eat();
//		cat.catchMouse();
//	}
//
//	public void feed(Dog dog){
//		dog.run("中华犬");
//	}
	
//	方案2
	public void feed(Animal obj){
//		obj.eat();
		if(obj instanceof Cat){
			Cat temp =(Cat)obj;
			temp.catchMouse();
		}else if(obj instanceof Dog){
			Dog temp=(Dog)obj;
			temp.eat();
		}
	}
}
