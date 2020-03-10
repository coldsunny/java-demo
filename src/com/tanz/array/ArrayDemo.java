package com.tanz.array;

import java.util.Scanner;

/**
 * 数组demo
 * @author Administrator
 *
 */
public class ArrayDemo {
	public static void main(String[] args){
		//方式一
		int[] intArray;

		//方式二
		String strArray[];

		intArray=new int[]{10,20,30,40,50};
		strArray=new String[10];
		float[] floatArray=new float[4];

		//初始化数组
		char[] ch={'a','b','c'};
		System.out.println("ch数组的长度为："+ch.length);
		System.out.println("intArray数组的第2个元素为："+intArray[1]);
		System.out.println("strArray数组的第5个元素为："+strArray[5]);
		System.out.println("floatArray数组的最后一个元素为："+floatArray[floatArray.length-1]);
		System.out.println(strArray[1]);

		//循环为整型数组赋值
		for(int i=0;i<5;i++){
			intArray[i]=i+1;
		}
		System.out.println("整型数组intArray的元素为："+intArray[0]);	
		 double d = 3.1415926;
	        System.out.printf("%.2f\n", d); // 显示两位小数3.14
	        System.out.printf("%.4f\n", d);
	        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
	        System.out.print("Input your name: "); // 打印提示
	        String name = scanner.nextLine(); // 读取一行输入并获取字符串
	        System.out.print("Input your age: "); // 打印提示
	        int age = scanner.nextInt(); // 读取一行输入并获取整数
	        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
	}
}
