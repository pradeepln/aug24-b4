package com.ibm.training.enums;

public class StudentApp {

	public static void main(String[] args) {
		OldStudent s1 = new OldStudent();
		
		s1.setId(1);
		s1.setName("pradeep");
		s1.setGrade(IGrade.GRADE_A);
		
		//s1.setGrade('z');
		//s1.setGrade('a');// or is it 'A'
		
		Student s2 = new Student();
		s2.setId(12);
		s2.setName("abc");
		
		
		s2.setGrade(Grade.GRADE_C);

	}

}
