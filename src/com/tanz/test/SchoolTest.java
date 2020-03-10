package com.tanz.test;
import com.tanz.model.Subject;
import com.tanz.model.Student;
public class SchoolTest {
	public static void main(String[] args){
//		测试专业类
		Subject sub1=new Subject("通信工程","10041",-4);
		System.out.println(sub1.info());
		System.out.println("================================");
		
//		测试学生类
		Student stu1=new Student("d1001","张三","女",-9);
		System.out.println(stu1.information()+"\n");
		
		Student stu2=new Student("d1002","李四","女性",20);
		System.out.println(stu2.information("网络工程", 4)+"\n");
		
		Student stu3=new Student("d1003","王五","男",19);
		System.out.println(stu3.information(sub1));
	}
}
