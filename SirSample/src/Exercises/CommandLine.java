package Exercises;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fnum = Integer.parseInt(args[0]);
		int snum = Integer.parseInt(args[1]);
		int sum  = fnum + snum ;
		System.out.println("The first number is " + fnum);
		System.out.println("The first number is " + snum);
		System.out.println("The first number is " + sum);
	}

}