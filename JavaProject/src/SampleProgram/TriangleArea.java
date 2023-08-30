package SampleProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		int height, base, area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter height");
	height = sc.nextInt();
	System.out.println("Enter base");
	base = sc.nextInt();
	area = (height*base)/2;
	System.out.println("Area of Triangle = "+ area);}

}
