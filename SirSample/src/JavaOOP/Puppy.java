package JavaOOP;

public class Puppy {

	private int puppyAge;   // private date field
	
	public Puppy (String name)
	{
	System.out.println("Name chosen is: "+ name);
	}
	public void setAge(int age)
	{
		puppyAge = age;
	}
	public int getAge() 
	{
		return puppyAge;
	}
	public class GetSetMethod_Test
	{
	}
	
		public static void main(String[] args) {
			Puppy myPuppy = new Puppy("Choco");
			
			myPuppy.setAge(2);
			
			System.out.println("Puppy's age is: "+ myPuppy.getAge());
	
	}

}
