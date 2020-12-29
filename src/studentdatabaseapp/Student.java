package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private int numberOfStudents;
	private String firstName;
	private String lastName;
	private int yearOfStudent;
	private String studentID;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private String courses = "";
	private static int id = 1000;
	
	// Constructor prompts user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student year: ");
		this.yearOfStudent = in.nextInt();
		
		setStudentID();
		
		
		
		
		
		
		
	}
	
	
	
		
	
	
	// Generate ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		studentID =  yearOfStudent + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits Q to quit 
		
	do {	
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();	
		if (!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			break;
		}
	}while(1 != 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment amount: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + yearOfStudent +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
}
