package SampleProgram;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hypotenuse, base,perpendicular, area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter hypotenuse");
	hypotenuse = sc.nextInt();
	System.out.println("Enter base");
	base = sc.nextInt();
	System.out.println("Enter perpendicular");
	perpendicular = sc.nextInt();
	
	if  (hypotenuse*hypotenuse==(base*base)+(perpendicular*perpendicular)) { 
		System.out.println("Right Triangle!!");
	}
	else {
		System.out.println("Not Right Triangle.");
	}}}


