package com.tanz.test;

import com.tanz.model.Animal;
import com.tanz.model.Cat;

/**
 * ClassName:CatTest
 * @author Administrator
 * @version 创建时间 ：2019年4月8日
 */
public class CatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal em = new Cat();
		// Animal em = new Animal();
		// Cat em = new Cat();
		// Cat em =new Animal();
		em.eat();
		em.sleep();
		em.run();

		// em.catchMouse();
		// System.out.println(em.name);

//		System.out.println(em.num);
//		System.out.println(em.age);

		System.out.println("-----分割线----");
		Cat cc = (Cat) em;
		cc.eat();
		cc.run();
		cc.sleep();
		cc.catchMouse();
	}
}
