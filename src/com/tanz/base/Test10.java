package com.tanz.base;

public class Test10 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {// 输出空格随着循环是递减的
				System.out.print("-");
			}
			for (int k = 0; k <= i * 2; k++) {// 输出*号随着外循环是递增的,当k<=i时 只打印三角形的一半,首先k是从0开始的												
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
