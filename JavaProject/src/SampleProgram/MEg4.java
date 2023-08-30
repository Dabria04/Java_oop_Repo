package SampleProgram;

public class MEg4 {

	int a, b;
	public MEg4(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {

		MEg4 m1 = new MEg4(10, 20);
		
		
		System.out.println("Before Swapping");
		System.out.println("m1 a = " + m1.a + " m2 b = " + m1.b);
		
		swap(m1);
		
		System.out.println("After Swapping");
		System.out.println("m1 a = " + m1.a + " m2 b = " + m1.b);
	}
	public static void swap(MEg4 m2)
	{
		int temp = m2.a;
		m2.a = m2.b;
		m2.b = temp;
	}

}
