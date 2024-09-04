package com.ibm.training.basics;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		int phy = Integer.parseInt(args[0]);
		int chem = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		
		String grade = calculateGrade(phy, chem, math);
		//A - Congrats,Well done
		//B - Well done
		//C - Well
		//use switch
		
		switch(grade) {
		case "A":
			System.out.println("Congrats,Well done");
			break;
		case "B":
			System.out.println("Well done");
			break;
		case "C":
			System.out.println("Well");
			break;
		}
		
	}
	
	
	static public String calculateGrade(int phy,int chem,int math) {
		//if % is 80 or more the "A", if 70 and 80 B, less than 70 C
		//use if
		float average = (phy + chem + math)/3f;
		
		if(average >= 80) {
			return "A";
		}else if(average < 80 && average >= 70) {
			return "B";
		}else {
			return "C";
		}
		
		
	}

}
