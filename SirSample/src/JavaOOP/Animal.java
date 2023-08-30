package JavaOOP;

public class Animal {
	
	public String name;
	public int height;
	private String gender;
	
	public String getGender (String Something)
	{
		this.gender = Something;
		return this.gender;
	}
	
	public void getAnimal()
	{
		name = "Choco";
		height = 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal();
		System.out.println(dog.name);  //null (as no value is assigned yet)
		dog.getAnimal();               //Assign value by invoking method
		System.out.println(dog.name);
		System.out.println(dog.height);
		System.out.println(dog.gender); // null (as no value is assigned)
		System.out.println(dog.getGender("male"));
	}

}
