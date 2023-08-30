package Exercises;

public class VariableTypes {

	static String name = "Lin Lin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getName();
		VariableTypes vt = new VariableTypes();
		vt.getAge();
		
	}
	
	public static void getName ()
	{
		System.out.println(name);
	}

	public void getAge () {
		int age = 20;
		System.out.println(age);
		
	}
}
