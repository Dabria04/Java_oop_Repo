package SearchingSorting;

import java.util.Scanner;

public class ElectronicSystem {

	static Scanner sc = new Scanner(System.in);
	static Item[]I;
	public ElectronicSystem()
	{
		 I = new Item[5];
		
		Item i1 = new Item("TV", 700000.00, 20);
		Item i2 = new Item("Phone", 500000.00, 20);
		Item i3 = new Item("Microwave", 200000.00, 20);
		Item i4 = new Item("Iron", 10000.00, 20);
		Item i5 = new Item("Oven", 300000.00, 20);
		
		I[0] = i1;
		I[1] = i2;
		I[2] = i3;
		I[3] = i4;
		I[4] = i5;
		
	}
	public void WelcomePage()
	{
		System.out.println("Welcome Electronic System");
		System.out.println("1. View Sell Item List");
		System.out.println("2. Search item list by item name:");
        System.out.println("Choose Option: ");
        int option = sc.nextInt();
        
        switch (option)
        {
        case 1: ViewSellItem();break;
        case 2: SearchItem();break;
        default: {
        	System.out.println("Wrong Input");
        	WelcomePage();
        }
        }
	}
	public void ViewSellItem()
	{
		System.out.println("Item Name    Price     Qunatity");
	   for(Item i : I)
	   {
		   System.out.println(i.getItemname() + " " + i.getPrice() + " " + i.getQty() );
	   }
	}
	public void SearchItem()
	{
		sc.nextLine();
		System.out.print("Enter search key item name: ");
		String SIname = sc.nextLine();
		int i;
		for( i = 0; i < I.length; i++)
		{
			if(SIname.equalsIgnoreCase(I[i].getItemname()))
			{
				System.out.println(I[i].getItemname()+ " " + I[i].getPrice()+ " "+ I[i].getQty());
				break;
			}
		}
		if(i == I.length)
		{
			System.out.println(SIname + " is not found");
		}
	}
}
