package com.tanz.base;

public class Test09 {

    public static void main(String[] args) {
        Fu foo = new Zi();
        foo.print_info();
    }
}

class Fu{
    public void print_info(){
        System.out.println("父类的print_info");
        fun();
    }
    public void fun(){
        System.out.println("我是父类！");
    }
}
class Zi extends Fu{
    public void fun(){
        System.out.println("==我是子类！");
    }
}
