package com.tanz.chouxianglei;
/**
 * 第一代电话
 * @author tanz
 *
 */

public abstract class Telphone {
	private String brand;
	private int price;
	
	public Telphone(){
		
	}
	
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//
	public void call(){
		System.out.println("第一代智能手机打电话");
	}
}

