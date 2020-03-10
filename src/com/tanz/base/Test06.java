package com.tanz.base;

//定义一个员工类Employee
class Employee {
	private String empno;
	private String empname;
	private float salary;
	private float inc;

	// 构造方法
	public Employee() {
	}

	public Employee(String empno, String empname, float salary, float inc) {
		this.setEmpno(empno);
		this.setEmpname(empname);
		this.setSalary(salary);
		this.setInc(inc);
	}

	// setter方法
	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setInc(float inc) {
		this.inc = inc;
	}

	// getter方法
	public String getEmpno() {
		return this.empno;
	}

	public String getEmpname() {
		return this.empname;
	}

	public float getSalary() {
		return this.salary;
	}

	public float getInc() {
		return this.inc;
	}

	// 计算增长后的工资总额
	public float calSalary() {
		return this.salary + this.salary * this.inc;
	}
}

public class Test06 {
	public static void main(String[] args) {
		Employee e = new Employee("a1001", "卡洛斯", 8500.0f, 0.15f);
		System.out.println(e.calSalary());
	}
}
