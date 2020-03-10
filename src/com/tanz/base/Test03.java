package com.tanz.base;

public class Test03 {
	public static void main(String[] args) {
		int i[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		@SuppressWarnings("unused")
		boolean flag = false;
		for (int y = 0; y < i.length; y++) {
			System.out.println("y的值" + y);
		}
		System.out.print(i[9]);
	}
}
