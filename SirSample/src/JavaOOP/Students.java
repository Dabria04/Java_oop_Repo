package JavaOOP;

public class Students {


	public Students()
	  {
	    System.out.println("Students Constractor");
	  }
	  
	  public Students(String name)
	  {
	    System.out.println("Name is  " + name);
	  }
	  
	  public static void main(String[] args) {
	    Students st1 = new Students();
	    Students st = new Students("Maung Maung");
	    Students st2 = new Students ("Aung Anug");
	  }
}

