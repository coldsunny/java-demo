package com.tanz.model;
/**
 * 专业类
 * @author tz
 */
public class Subject {
//	类的成员属性
	private String subjectName; //学科名称
	private String subjectNo;  //学科编号
	private int subjectLife; //学制年限

//无参构造
	public Subject(){
		
	}
	
//	有参构造
	public Subject(String subjectName,String subjectNo,int subjectLife){
//		this.subjectName=subjectName;
//		this.subjectNo=subjectNo;
//		this.subjectLife=subjectLife;
		this.setSubajectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
//	set和get方法
	public String getSubjectName(){
		return subjectName;
	}
	public void setSubajectName(String subjectName){
		this.subjectName =subjectName;
	}
	public String getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}
	public int getSubjectLife() {
		return subjectLife;
	}
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<0)
			return;
		this.subjectLife = subjectLife;
	}
	
	/**
	 * 专业介绍的方法
	 * @return 返回专业名称、专业编号、学制年限
	 */
	public String info(){
		String str="专业信息如下:\n专业名称:"+this.getSubjectName()+"\n专业编号:"+this.getSubjectNo()
		+"\n学制年限:"+this.getSubjectLife()+"年";
		return str;
	}
}
