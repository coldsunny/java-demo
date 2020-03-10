package com.tanz.test;

import com.tanz.model.Animal;

public class AnimalTest {
	public static void main(String[] args){
		Animal one=new Animal("小猫咪",3);
		Animal two=new Animal("小猫咪",3);
		one.run();
		//equals
		boolean flag=one.equals(two);
		System.out.println(flag);
		System.out.println((one==two));
		
		System.out.println("==================");
		String str1=new String("allow");
		String str2=new String("allow");
		flag=str1.equals(str2);
		System.out.println(flag);
		System.out.println((str1==str2));
		
		System.out.println(one.toString());
		System.out.println(one);
	}
}
