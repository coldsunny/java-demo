package com.tanz.base;

public class Test02 {

	public static void main(String[] args) {
		// 申明数组并赋值
		int i[] = null;
		// 开辟数组空间
		i = new int[100];
		// 为数组中每个元素赋值
		for (int y = 0; y < 100; y++) {
			i[y] = 2 * y + 1;
		}
		// 使用数组
		for (int x = 0; x < 100; x++) {
			System.out.println("i[" + x + "]=" + i[x]);
		}
	}

}
