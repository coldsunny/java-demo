package com.tanz.test;

import com.tanz.model.Cat;
import com.tanz.model.Dog;
import com.tanz.model.Master;

public class MasterTest {
	public static void main(String[] args){
		Master master=new Master();
		Cat one =new  Cat();
		Dog two =new Dog();
		master.feed(one);
		master.feed(two);		
	}
}
