package com.tanz.base;

/*public class Test05 {
	public static void main(String[] args){
		String a ="122";
		String b = new String("abc");
		System.out.println(a);
		System.out.print(b);
	}
}
*/
class M {
	int x = 10;
}

public class Test05 {
	public static void main(String[] args) {
		M m = new M();
		m.x = 30;
		fun(m);
		System.out.println(m.x);
	}

	public static void fun(M m1) {
		m1.x = 60;
	}
}
