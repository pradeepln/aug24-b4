package com.ibm.training.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayGreeter {

	public static void main(String[] args) {
		
//		int day = 12;
//		int month = 9;
//		int year = 1999;
//		
//		LocalDate birthday = LocalDate.of(year, month, day) ;// can't do new LocalDate();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your birthday: (dd/MM/yyyy) ");
		String input = kb.nextLine();
		
		LocalDate birthday = LocalDate.parse(input,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("You were born on a "+birthday.getDayOfWeek()+" which was on "+birthday.getDayOfYear()+"th day of the year");
		Year thatYear = Year.of(birthday.getYear());
		System.out.println("Was it a leap year ? "+thatYear.isLeap());
		
		LocalDate turnOfMillenium = LocalDate.of(200, 1, 1);
		
		System.out.println("You were born "+((birthday.isAfter(turnOfMillenium))?"before":"after")+" the turn of the millennium.");
		
		System.out.println("What if you were born 1 month before? ");
		LocalDate oneMonthBefore = birthday.minusMonths(1);
		System.out.println("You would have been born on a "+oneMonthBefore.getDayOfWeek()+" which was on "+oneMonthBefore.getDayOfYear()+"th day of the year");

		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old!");
		
		System.out.println("today's date : "+today);
		
		System.out.println("Today's date : "+today.format(DateTimeFormatter.ofPattern("E dd/MM/yyyy")));
	}

}
