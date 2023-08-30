package JavaOOP;

public class Super_class {

	int num = 20;
	
	public void display()
	{
		System.out.println("This is the display method of superclass");
	}
	
}
class Sub_class extends Super_class
{
	int num = 10;
	public void display() {
		System.out.println("This is the display method of subclass");
}

public void my_method()
{
	Sub_class sub = new Sub_class();
	
	sub.display();
	super.display();
	System.out.println("Value of the  variable  named num in sub class: " + sub.num);
	System.out.println("Value of the variable named num in super class: " + super.num);
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_class obj = new Sub_class();
		obj.my_method();
	}

}
