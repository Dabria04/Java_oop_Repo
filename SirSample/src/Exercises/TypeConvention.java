package Exercises;

import java.util.Scanner;

public class TypeConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Username");
		String username = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		
			if (username.equals("linlin") && password.equals("123")) {
				System.out.println("Correct User");
			}
		}

	}



//float b = 39;
//double c = (float)b;
//System.out.println(c);

//int > double = 1
//double > float = 0
//float > double = 1