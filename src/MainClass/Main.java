package MainClass;
import items.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	
	static LinkedHashMap<String,Integer> cartitemprice = new LinkedHashMap<String,Integer>(); 
	static LinkedHashMap<String,Integer> cartitemqty = new LinkedHashMap<String,Integer>(); 
	static Scanner scan=new Scanner(System.in);
	static Clothing clothing = new Clothing();
	static Electronics electronics = new Electronics();
	static Groceries groceries = new Groceries();
	static HouseHold household = new HouseHold();
	static Cart cart = new Cart();
	static Billing billing = new Billing();
	
	public static void main(String[] args) {  
		 
		 //Scanner scan=new Scanner(System.in);
		 System.out.print("Enter your name : ");
		 String name=Main.scan.nextLine();
		 System.out.println("\n\n\n\t\t\t********************Welcome to Shopping world "+name.toUpperCase()+".***********************");
		 System.out.println("\n\n\n\t\t\t********************A few clicks is all it takes.**************************");
		 System.out.println("\n\n\nTime :"+java.time.LocalDate.now()); 
		 System.out.println("Date :"+java.time.LocalTime.now());
		 
		 Main.mainMenu();
	
	}   
	
	static void mainMenu()
	{
		 int choice;
		 //Scanner scan=new Scanner(System.in);
		 System.out.println("\n\nChoose the Menu:-");
		 MainMenu: System.out.print("\n\n1.Clothing\n2.Electonics\n3.Grocery\n4.Household\n5.Cart\n6.Billing\n7.Exit\n");
		 
		 do
		 {
			 choice=Main.scan.nextInt();
			 switch (choice)
			 {
			 	case 1:
			 	{
			 		Main.clothing.menu();
			 		break;
			 	}
			 	case 2:
			 	{
			 		Main.electronics.electronicsItems();
			 		break;
			 	}
			 	case 3:
			 	{
			 		Main.groceries.groceriesItems();
			 		break;
			 	}
			 	case 4:
			 	{
			 		Main.household.houseHoldItems();
			 		break;
			 	}
			 	case 5:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 6:
			 	{
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 7:
			 	{
			 		System.exit(0);
			 		break;
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
			 	
			 }
		 }while(true);
	}
	
}


class Clothing
{
	//Scanner scan=new Scanner(System.in);
	void menu()
	{
		System.out.print("\n\n1.Mens\n2.Womens\n3.Kids\n4.Cart\n5.Billing\n6.Main menu\n7.Exit\n\n");
		int choice;
		choice = Main.scan.nextInt();
		
		switch (choice)
	 	{
	 		case 1:
	 		{	
	 			Man man = new Man();
	 			man.manItems();
	 			break;
	 		}
		 	case 2:
		 	{
		 		Womens womens = new Womens();
		 		womens.womensItems();
		 		break;
		 	}
		 	case 3:
		 	{
		 		Kids kids = new Kids();
		 		kids.kidsItems();
		 		break;
		 	}
		 	case 4:
		 	{
		 		Main.cart.cartItems();
		 		break;
		 	}
		 	case 5:
		 	{
		 		Main.billing.calculateBill();
		 		break;
		 	}
		 	case 6:
		 	{
		 		Main.mainMenu();
		 		break;
		 	}
		 	case 7:
		 	{
		 		System.exit(0);
		 		break;
		 	}
		 	default:
		 	{
		 		System.out.println("Selected option does not exit. Please select the correct option.\n");
		 	}
	 	}
	}
}


class Man
{
	//Scanner scan=new Scanner(System.in);
	//Cart cartobj = new Cart();
	void manItems()
	{
		int cho;
		
		do
		{
		    System.out.print("\n\n1.Pants\n2.Shirts\n3.Shoes\n4.Cart\n5.Billing\n6.Main menu\n");
			cho=Main.scan.nextInt();
			switch (cho)
		 	{
		 		case 1:
		 		{	
		 			LinkedHashMap pant = Items.getPantIns();
		 			Main.cart.addToCart(pant);
		 			break;
		 		}
			 	case 2:
			 	{
			 		
			 		LinkedHashMap shirt = Items.getShirtsIns();
		 			Main.cart.addToCart(shirt);
			 		
			 		break;
			 	}
			 	case 3:
			 	{
			 		LinkedHashMap shooes = Items.getShooesIns();
			 		Main.cart.addToCart(shooes);
			 		
			 		break;
			 	}
			 	case 4:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 5:
			 	{
			 		//Billing bill = new Billing();
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 6:
			 	{
			 		Main.mainMenu();
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
		 	}
			
		}while(true);
	}
}


class Womens
{
	int cho;
	void womensItems()
	{
		do
		{
		    System.out.print("\n\n1.Jeans\n2.Kurtis\n3.Tops & T-Shirts\n4.Shoes & Sandle\n5.Cart\n6.Billing\n7.Main menu\n");
			cho=Main.scan.nextInt();
			switch (cho)
		 	{
		 		case 1:
		 		{	
		 			LinkedHashMap jeans = Items.getJeansIns();
		 			Main.cart.addToCart(jeans);
		 			break;
		 		}
			 	case 2:
			 	{
			 		
			 		LinkedHashMap kurti = Items.getKurtisIns();
		 			Main.cart.addToCart(kurti);
			 		
			 		break;
			 	}
			 	case 3:
			 	{
			 		LinkedHashMap tops = Items.getTopsIns();
			 		Main.cart.addToCart(tops);
			 		
			 		break;
			 	}
			 	case 4:
			 	{
			 		LinkedHashMap sandle = Items.getSandleIns();
			 		Main.cart.addToCart(sandle);
			 		
			 		break;
			 	}
			 	case 5:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 6:
			 	{
			 		//Billing bill = new Billing();
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 7:
			 	{
			 		Main.mainMenu();
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
		 	}
			
		}while(true);
	}
}


class Kids
{
	void kidsItems()
	{

		int cho;
		
		do
		{
		    System.out.print("\n\n1.Kids Pants\n2.Kids Shirts\n3.Kids Shoes\n4.Dipper\n5.Cart\n6.Billing\n7.Main menu\n");
			cho=Main.scan.nextInt();
			switch (cho)
		 	{
		 		case 1:
		 		{	
		 			LinkedHashMap kpant = Items.getKPantIns();
		 			Main.cart.addToCart(kpant);
		 			break;
		 		}
			 	case 2:
			 	{
			 		
			 		LinkedHashMap kshirt = Items.getKShirtsIns();
		 			Main.cart.addToCart(kshirt);
			 		
			 		break;
			 	}
			 	case 3:
			 	{
			 		LinkedHashMap kshooes = Items.getKShooesIns();
			 		Main.cart.addToCart(kshooes);
			 		
			 		break;
			 	}
			 	case 4:
			 	{
			 		LinkedHashMap dipper = Items.getDipperIns();
			 		Main.cart.addToCart(dipper);
			 		
			 		break;
			 	}
			 	case 5:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 6:
			 	{
			 		//Billing bill = new Billing();
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 7:
			 	{
			 		Main.mainMenu();
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
		 	}
			
		}while(true);
	}
}


class Electronics
{
	
	//Scanner scan=new Scanner(System.in);
	//Cart cartobj = new Cart();
	void electronicsItems()
	{
		int cho;
		
		do
		{
			System.out.print("\n\n1.Mobile\n2.Earephone\n3.Back cover\n4.Trimmer\n5.Cart\n6.Billing\n7.Main menu\n");
			cho=Main.scan.nextInt();
			switch (cho)
		 	{
		 		case 1:
		 		{	
		 			LinkedHashMap mobile = Items.getMobileIns();
		 			Main.cart.addToCart(mobile);
		 			break;
		 		}
			 	case 2:
			 	{
			 		
			 		LinkedHashMap earphone = Items.getEarphoneIns();
			 		Main.cart.addToCart(earphone);
			 		break;
			 	}
			 	case 3:
			 	{
			 		LinkedHashMap backcover = Items.getBackCoverIns();
			 		Main.cart.addToCart(backcover);
			 		break;
			 	}
			 	case 4:
			 	{
			 		LinkedHashMap trimmer = Items.getTrimmerIns();
			 		Main.cart.addToCart(trimmer);
			 		break;
			 	}
			 	case 5:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 6:
			 	{
			 		//Billing bill = new Billing();
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 7:
			 	{
			 		Main.mainMenu();
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
		 	}
			
		}while(true);
		
	}
	
}


class Groceries
{
	void groceriesItems()
	{
		int cho;
		
		do
		{
			System.out.print("\n\n1.Rice\n2.Pulses\n3.Spices\n4.Oil\n5.Cart\n6.Billing\n7.Main menu\n");
			cho=Main.scan.nextInt();
			switch (cho)
		 	{
		 		case 1:
		 		{	
		 			LinkedHashMap rice = Items.getRiceIns();
		 			Main.cart.addToCart(rice);
		 			break;
		 		}
			 	case 2:
			 	{
			 		
			 		LinkedHashMap pulses = Items.getPulsesIns();
			 		Main.cart.addToCart(pulses);
			 		break;
			 	}
			 	case 3:
			 	{
			 		LinkedHashMap spices = Items.getSpicesIns();
			 		Main.cart.addToCart(spices);
			 		break;
			 	}
			 	case 4:
			 	{
			 		LinkedHashMap oil = Items.getOilIns();
			 		Main.cart.addToCart(oil);
			 		break;
			 	}
			 	case 5:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 6:
			 	{
			 		//Billing bill = new Billing();
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 7:
			 	{
			 		Main.mainMenu();
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
		 	}
			
		}while(true);
		
	}
}


class HouseHold
{
	void houseHoldItems()
	{
		int cho;
		
		do
		{
			System.out.print("\n\n1.Utensils\n2.Living Room Furniture\n3.Kitchen Items\n4.BedRoom Items\n5.Cart\n6.Billing\n7.Main menu\n");
			cho=Main.scan.nextInt();
			switch (cho)
		 	{
		 		case 1:
		 		{	
		 			LinkedHashMap utensils = Items.getUtensilsIns();
		 			Main.cart.addToCart(utensils);
		 			break;
		 		}
			 	case 2:
			 	{
			 		
			 		LinkedHashMap furniture = Items.getFurnitureIns();
			 		Main.cart.addToCart(furniture);
			 		break;
			 	}
			 	case 3:
			 	{
			 		LinkedHashMap kitchen = Items.getKitchenIns();
			 		Main.cart.addToCart(kitchen);
			 		break;
			 	}
			 	case 4:
			 	{
			 		LinkedHashMap bedroom = Items.getBedRoomIns();
			 		Main.cart.addToCart(bedroom);
			 		break;
			 	}
			 	case 5:
			 	{
			 		Main.cart.cartItems();
			 		break;
			 	}
			 	case 6:
			 	{
			 		//Billing bill = new Billing();
			 		Main.billing.calculateBill();
			 		break;
			 	}
			 	case 7:
			 	{
			 		Main.mainMenu();
			 	}
			 	default:
			 	{
			 		System.out.println("Selected option does not exit. Please select the correct option.\n");
			 	}
		 	}
			
			
		}while(true);
		
	}
}


class Cart
{
	
	void cartItems()
	{
		if(!Main.cartitemprice.isEmpty() && !Main.cartitemqty.isEmpty())
		{
			System.out.println("\n\t\t\t\t**************** Your cart items are : ****************\n");
			ArrayList<String> l=new ArrayList<String>(Main.cartitemprice.keySet());
			int i=1;
			System.out.println("S No. \t\t\tItems\t\t\t\t Price\t\tQty");
			for(String s : l)
			{
				System.out.println(i+".\t\t"+String.format("%-30s",s)+" "+String.format("%15s",Main.cartitemprice.get(s))+"\t\t"+Main.cartitemqty.get(s));
				i++;
			}
		}
		else
		{
			System.out.println("\nCurrently you did not add anything into you cart.\n");
		}
	}
	
	void addToCart(LinkedHashMap LnkHsMp)
	{
		int i = 1;
		ArrayList<String> ls=new ArrayList<String>(LnkHsMp.keySet());
		for(String s : ls)
		{
			System.out.println(i+". "+String.format("%-30s",s)+"\t : \t"+String.format("%-30s",String.format("%.2f",(double)((int)(LnkHsMp.get(s))))));
			i++;
		}
		System.out.println("Please select one of the product : ");
		int n = Main.scan.nextInt();
		System.out.println("How many Quantity?");
		int qty = Main.scan.nextInt();
		Main.cartitemprice.put(ls.get(n-1),(int)LnkHsMp.get(ls.get(n-1)));
		if(Main.cartitemqty.containsKey(ls.get(n-1)))
		{
			Main.cartitemqty.put(ls.get(n-1),(Main.cartitemqty.get(ls.get(n-1)))+qty);
		}
		else
		{
			Main.cartitemqty.put(ls.get(n-1),qty);
		}
		
		ArrayList<String> l=new ArrayList<String>(Main.cartitemqty.keySet());
		int totalItemInCart = 0;
		for(String s : l)
		{
			totalItemInCart += (int)Main.cartitemqty.get(s);
		}
		System.out.println("\nThere are "+totalItemInCart+" Items in your cart.\n");
		
		
	}
	
}


class Billing
{
	void calculateBill()
	{
		if(!Main.cartitemprice.isEmpty() && !Main.cartitemqty.isEmpty())
		{
			double tot = 0, cgst = 0, sgst = 0, total = 0;
			int totalItem = 0;
			
			System.out.println("\n\t\t\t\t**************** Your Bill is : ****************\n");
			ArrayList<String> l=new ArrayList<String>(Main.cartitemprice.keySet());
			int i=1;
			System.out.println("S No. \t\t\tItems\t\t\t\t Price\t\tQty\t\tTotal");
			for(String s : l)
			{
				tot = ((int)Main.cartitemprice.get(s))*((int)Main.cartitemqty.get(s));
				total += tot;
				totalItem += (int)Main.cartitemqty.get(s);
				System.out.println(i+".\t\t"+String.format("%-30s",s)+" "+String.format("%15s",Main.cartitemprice.get(s))+"\t\t"+Main.cartitemqty.get(s)+"\t\t"+String.format("%.2f",tot));
				i++;
			}
			System.out.println("\nSUB TOTAL\t\t\t\t\t\t\t\t"+totalItem+"\t\t"+String.format("%.2f",total)+"\n\n");
			
			if(total >= 20000 && total <= 30000)
			{
				System.out.println("Congratulations.. You have avail the 5% discount and you saved Rs."+String.format("%.2f",(total*(0.05)))+".\n");
				System.out.println("\n\t\t\t\t\t\t\t\t\tDiscount\t"+String.format("%.2f",(total*(-0.05))));
				total = total - (total*(0.05));
			}
			else if(total >30000 && total <= 40000)
			{
				System.out.println("Congratulations.. You have avail the 10% discount and you saved Rs."+String.format("%.2f",(total*(0.10)))+".\n");
				System.out.println("\n\t\t\t\t\t\t\t\t\tDiscount\t"+String.format("%.2f",(total*(-0.10))));
				total = total - (total*(0.10));
			}
			else if(total > 40000)
			{
				System.out.println("Congratulations.. You have avail the 20% discount and you saved Rs."+String.format("%.2f",(total*(0.20)))+".\n");
				System.out.println("\n\t\t\t\t\t\t\t\t\tDiscount\t"+String.format("%.2f",(total*(-0.20))));
				total = total - (total*(0.20));
			}
			
			cgst = total*(0.06);
			sgst = total*(0.06);
			System.out.println("\t\t\t\t\t\t\t\t\tSGST\t\t"+String.format("%.2f",sgst));
			System.out.println("\t\t\t\t\t\t\t\t\tCGST\t\t"+String.format("%.2f",cgst));
			double totalsum = total + cgst + sgst;
			System.out.println("\t\t\t\t\t\t\t\tPayable Amount\t\t"+String.format("%.2f",totalsum)+"\n\n");
			
			System.out.println("Thanks for shopping with us. Have a nice day.\n\n Do you want to continue? yes/no\n");
			String contvar;
			Main.scan.nextLine();
			contvar = Main.scan.nextLine();
			if(contvar.equals("yes"))
			{
				Main.mainMenu();
			}
			else
			{
				System.exit(0);
			}
		}
		else
		{
			System.out.println("\nCurrently you did not add anything into you cart. Please add items to your cart to generate bill.\n");
		}
	}
}

