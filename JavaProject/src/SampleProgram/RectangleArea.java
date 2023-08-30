package SampleProgram;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int length, width, area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter length");
length = sc.nextInt();
System.out.println("Enter width");
width = sc.nextInt();
area = (length*width);
System.out.println("Area of Rectangle = "+ area);}
	}


