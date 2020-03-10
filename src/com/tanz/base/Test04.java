package com.tanz.base;

class Employee1 {
	// 员工号
	private String empno;
	// 姓名
	private String name;
	// 薪水
	private float salary;
	// 部门
	private String dept;

	// 无参的构造方法一般都是写在第一个哈~~
	public Employee1() {
	}

	public Employee1(String no) {
		this.setEmpno(no);
		this.setName("无名氏");
		this.setSalary(0.0f);
		this.setDept("未定");
	}

	public Employee1(String no, String na) {
		this.setEmpno(no);
		this.setName(na);
		this.setSalary(1000.0f);
		this.setDept("后勤");
	}

	public Employee1(String no, String na, float sa, String d) {
		this.setEmpno(no);
		this.setName(na);
		this.setSalary(sa);
		this.setDept(d);
	}

	// 显示信息
	public void showMsg() {
		System.out.println("员工信息为：");
		System.out.println("\t|- 员工号：" + empno);
		System.out.println("\t|- 姓名：" + name);
		System.out.println("\t|- 薪水：" + salary);
		System.out.println("\t|- 部门：" + dept);
	}

	// 代码之后必须有setter和getter
	public void setEmpno(String a) {
		empno = a;
	}

	public void setName(String n) {
		name = n;
	}

	public void setSalary(float s) {
		if (s >= 0.0f) {
			salary = s;
		}
	}

	public void setDept(String d) {
		dept = d;
	}

	public String getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}
}

// 主类
public class Test04 {
	public static void main(String args[]) {
		Employee1 e1 = new Employee1("e001", "王乾");
		Employee1 e2 = new Employee1("e002", "王乾", 10000.0f, "开发部");
		e1.showMsg();
		e2.showMsg();
	}
}
