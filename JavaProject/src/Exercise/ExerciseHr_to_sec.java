package Exercise;

import java.util.Scanner;

public class ExerciseHr_to_sec {

	static int hrtosec;
	static int mintosec;
	static int totalsec;
	public static void main(String[] args) {
		
		while(true)
		{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter hours: ");
		int hr = sc.nextInt();
		System.out.print("Enter minutes: ");
		int min = sc.nextInt();
		System.out.print("Enter seconds: ");
		int sec = sc.nextInt();
		System.out.println("Hours: " + hr + " Minutes : " + min + " Second : " + sec );
		Hr_to_sec (hr, min, sec);
		System.out.println("Total sec : " + Hr_to_sec(hr,min,sec));
	    }
	}
	public static long Hr_to_sec (int hr, int min, int sec )
	{
		hrtosec = hr*3600;
		mintosec = min*60;
		totalsec = sec+ hrtosec+mintosec;
		return totalsec;
	} 
}
