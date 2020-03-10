package com.tanz.model;
/**
 * 学生类
 * @author tanz
 * 2019-4-1
 */
public class Student {
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;
	
//	无参构造方法
	public Student(){
		
	}
	
//	带参构造方法
	public Student(String studentNo,String studentName,String studentSex,int studentAge){
//		this.studentNo=studentNo;  
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		
	}
//	带参构造方法
	public Student(String studentNo,String studentName,String studentSex,int studentAge,Subject studentSubject){
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
		
	}
		
		
	

	
	// set和get方法
	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		    return this.studentSex;
	}

	public void setStudentSex(String studentSex) {
		if(studentSex !="男" && studentSex !="女")
			this.studentSex="男";
		else
		    this.studentSex = studentSex;
	}

	public int getStudentAge() {
		return this.studentAge;
	}

	public void setStudentAge(int studentAge) {
		if(studentAge<0 || studentAge>100)
			this.studentAge=18;
		else
		    this.studentAge = studentAge;
	}
	
	public Subject getStudentSubject(){
		this.studentSubject =new Subject();
		return studentSubject;
	}
	public void setStudentSubject(Subject studentSubject){
		this.studentSubject=studentSubject;
	}

	{
		System.out.println("我是普通代码块");
	}
	
	/**
	 * information()方法
	 * @return  返回学生编号、学生姓名、学生性别、学生年龄
	 */
	public String information(){
		String str1="学生信息如下:\n学生编号:"+this.getStudentNo()
		+"\n学生姓名:"+this.getStudentName()+"\n学生性别:"+this.getStudentSex()
		+"\n学生年龄:"+this.getStudentAge()+"岁";
		return str1;
	}

	/**
	 * information()方法重载
	 * @param subjectName
	 * @param subjectLife
	 * @return 返回学生学生编号、学生姓名、学生性别、学生年龄、所学专业名称、专业年限等信息
	 */
	public String information(String subjectName,int subjectLife){
		String str1="学生信息如下:\n学生编号:"+this.getStudentNo()
		+"\n学生姓名:"+this.getStudentName()+"\n学生性别:"+this.getStudentSex()
		+"\n学生年龄:"+this.getStudentAge()+"岁"+"\n所学专业名称:"
		+subjectName+"\n专业年限:"+subjectLife+"年";
		return str1;
	}
	
	/**
	 * information()方法重载
	 * @param mySubject 对象参数
	 * @return 返回学生学生编号、学生姓名、学生性别、学生年龄、所学专业名称、专业年限等信息
	 */
	public String information(Subject mySubject){
		String str1="学生信息如下:\n学生编号:"+this.getStudentNo()
		+"\n学生姓名:"+this.getStudentName()+"\n学生性别:"+this.getStudentSex()
		+"\n学生年龄:"+this.getStudentAge()+"岁"+"\n所学专业名称:"
		+mySubject.getSubjectName()+"\n专业年限:"+mySubject.getSubjectLife()+"年"
		+"\n专业编号:"+mySubject.getSubjectNo();
		return str1;
	}
}
