package Exercise;

public class Student {

	public int studentage;
	public Student(String name)
	{
	    System.out.println("The Student name is: "+ name);
	}
	public void setAge(int age)
	{
		 studentage = age;
	}
	public int getAge()
	{
		return studentage ;
	}
	
	public static void main(String[] args) {
		Student student = new Student("Lin Myat Thu");
		student.setAge(20);
		System.out.println("The Student's age: " + student.getAge());
	}

}
