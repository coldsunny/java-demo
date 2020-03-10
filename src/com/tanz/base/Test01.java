package com.tanz.base;

public class Test01 {
	public static void main(String[] args) {
		float a = 11.0f;
		int b = 2;
		// b=(int)a;
		a = b;
		char c = 'q';
		b = c + 1;
		boolean d = true;
		b = d ? 1 : 0;// 布尔转int

		System.out.println(b);

	}
}
