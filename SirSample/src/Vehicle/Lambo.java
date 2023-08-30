package Vehicle;

public class Lambo extends Car {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambo lam = new Lambo();
		lam.ViewgetName();
		
	}
	public void ViewgetName()
	{
		super.getName("Aung Aung", 20);
	}

}
