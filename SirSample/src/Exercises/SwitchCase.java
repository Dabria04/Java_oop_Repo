package Exercises;

import java.util.Scanner;

public class SwitchCase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter First Value: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Value: ");
		int b = sc.nextInt();
		System.out.println("Enter '+' or '-' or '*' or '/'");
		String con = sc.next();
		
		switch (con) {
		case "+": 
			System.out.println("Sum of two numbers is: "+ (a+b));break;
		case "-":
			System.out.println("Substraction of two numbers is: "+ (a-b));break;
		case "*":
			System.out.println("Multiply of two numbers is: "+ (a * b));break;
		case "/":
			System.out.println("Division of two numbers is: "+ (a / b));break;
		
		default:
		System.out.println("Invalid input!!!");
		flag = true;
		break;
	}
		}
		while(flag = true);
	
}
}