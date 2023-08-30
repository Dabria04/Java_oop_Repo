package Exercise;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		System.out.print("Enter the number of columns: ");
		int col = sc.nextInt();
		System.out.print("Enter the number of line: ");
		int line = sc.nextInt();
		
		display(ch, col, line);
		
	}
	public static void display (char ch, int col, int line)
	{
		for(int i = 1; i <= line ; i++)
		{
			for(int j = 1; j <= col; j++)
			{
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
