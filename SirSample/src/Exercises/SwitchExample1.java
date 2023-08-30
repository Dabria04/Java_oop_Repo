package Exercises;

public class SwitchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 5;
		int code = 2 ,result = 0;
		switch(code) {
		case 1: result = num1 + num2 ;break;
		case 2: result = num1 - num2 ;break;
		case 3: result = num1 * num2 ;break;
		case 4: result = num1 / num2 ;break;
		}
		System.out.println("Result = "+ result);
	}

}
