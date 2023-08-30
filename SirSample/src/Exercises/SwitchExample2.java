package Exercises;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 5;
		int result = 0;
		char code = '-';
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter Code");
//		char code = sc.next().charAt(0);
		switch (code) {
		case '+' : result = num1 + num2;break;
		case '-' : result = num1 - num2;break;
		case '*' : result = num1 * num2;break;
		case '/' : result = num1 / num2;break;
		}
		System.out.println("Result = "+ result);
	}

}
