package Exercises;

import java.util.Scanner;

public class Student {
	String name;
	int age;
	public Student() {
		Scanner st = new Scanner (System.in);
		System.out.print("Enter student's name: ");
		String name = st.nextLine();
		System.out.print("Enter student's age: ");
		int age = st.nextInt();
		this.name = name;
		this.age = age;
	}
	public static void main (String []args) {
		Student student = new Student();
		System.out.println(student.name + " " + student.age);
		
		
	}
}
