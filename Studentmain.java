package com.blc.elc;

public class Studentmain {

	public static void main(String[] args) {
		Student student=new Student();
		
		student.setStudentDetails("Roja",89,75);
		String res=student.getStudentDetails();
				System.out.println(res);

	}

}
