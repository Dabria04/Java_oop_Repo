package SampleProgram;

import java.util.Scanner;

public class MethodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter two number: ");
		int b = sc.nextInt();
		
		System.out.println("Before swapping ");
		System.out.println("A = "+ a + " B = " + b);
		
		swap(a, b);
		
		System.out.println("After swapping ");
		System.out.println("A = "+ a + " B = " + b);
	}

	public static void swap(int c, int d)
	{ 
		int temp = c;
		c = d;
		d = temp;
		System.out.println("After swapping ");
		System.out.println("C = "+ c + " D = " + d);
	}
}
