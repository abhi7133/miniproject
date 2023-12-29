package anudeepc;
import java.util.*;

//Write a program to create automobile service( Car Service Center )
//by using inheritance , Encapsulation, Abstraction, Polymorphism

 abstract class customer{

	
private	String name;
private	long contact_no;
private String Payment_method;


	public customer(String name, long contact_no,String Payment_method) {
		this.name = name;
		this.contact_no = contact_no;
		this.Payment_method=Payment_method;
	}
	
	public String getName() {
		return name;
	}
	
	public long getContact_no() {
		return contact_no;
	}
	
	public String getPayment_method() {
	return Payment_method;
}
	
	
}
//parent class
abstract class Vehicle {
 private String brand;
 private String model;
 private int year;

 public Vehicle(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 
 public abstract void performService();

 public String getBrand() {
     return brand;
 }

 public String getModel() {
     return model;
 }

 public int getYear() {
     return year;
 }

 @Override
 public String toString() {
     return year + " " + brand + " " + model;
 }
}


//child class
class Car extends Vehicle {
	Scanner sc=new Scanner(System.in);
	
	int sprice=0;
 public Car(String brand, String model, int year) {
     super(brand, model, year);
 }

 
 @Override
 public void performService() {
	 
     System.out.println("Performing general service for the car: " + this);
     
     System.out.println("**********************************************************************************************");
     
     System.out.println("\nBasic services usually include a visual inspection and oil and filter change,"
     + "\n the critical fluids in the engine such as anti-freeze, brake fluid, washer fluid, and steering fluid), are topped up."
     + "\n Also, to ensure the car is in the best condition possible, a check of up to 35 key components is carried out. ");
     
      System.out.println("**********************************************************************************************");
      
     System.out.println("types of car service:-"+"\n 1.Full car service"
    		 +"\n 2.Brakes repair"
    		 +"\n 3.Annual car maintenance"
    		 +"\n 4.Oil change,Change oil filter"
    		 +"\n 5.car washing " );
     char input;
     
     do {
    System.out.print("enter the type of service you want:-"); 
     int choice=sc.nextInt();
     int service_price;
      switch(choice) {
     case 1:
    	 System.out.println("\n Full car service"
    			+ "\n This is the most thorough type of car servicing and is usually recommended once a year."
    	 		+ "\n It involves a variety of inspections to ensure the car is in good working order.");
    	 if ("hondai".equals(getBrand()) || "maruti".equals(getBrand()) || "honda".equals(getBrand()) || "mahindra".equals(getBrand()) || "tata".equals(getBrand())) {

    	      service_price=10000;
    	      sprice+=service_price;
    		System.out.println("servicing price of th car is "+service_price);
    	}
    	else {
           service_price=20000;
           sprice+=service_price;
           System.out.println("servicing price of the car is "+service_price);
    	}
    	break;
    	
     case 2:
    	 System.out.println("\nBrakes repair:-"
    			 +"\nThis is a standard part of auto maintenance."
    			+"\n A good mechanic can spot the difference between normal wear and tear and a more serious issue.");
    	 
    	 if ("hondai".equals(getBrand()) || "maruti".equals(getBrand()) || "honda".equals(getBrand()) || "mahindra".equals(getBrand()) || "tata".equals(getBrand())) {
 
      	      service_price=5000;
      	    sprice+=service_price;
      		System.out.println("servicing price of th car is "+service_price);
      	}
      	else {
             service_price=10000;
             sprice+=service_price;
             System.out.println("servicing price of the car is "+service_price);
      	}
      	break;
      	
     case 3:
    	 System.out.println("Annual car maintenance\r\n"
    	 		+ "\nThis is like a full service for your car."
    	 		+ "\n It involves the manufacturer's recommended checks, and replacing parts that make your equipment run smoothly.");
    	
    	 if ("hondai".equals(getBrand()) || "maruti".equals(getBrand()) || "honda".equals(getBrand()) || "mahindra".equals(getBrand()) || "tata".equals(getBrand())) {
     	      service_price=20000;
     	     sprice+=service_price;
     		System.out.println("servicing price of th car is "+service_price);
     	}
     	else {
            service_price=40000;
            sprice+=service_price;
            System.out.println("servicing price of the car is "+service_price);
     	}
     	break;
     	
     case 4:
    	 System.out.println("Oil change\r\n"
    	 		+ "This is probably the most common form of auto maintenance. It provides clean oil to your engine for better lubrication and all-around performance.\r\n"
    	 		+ "Change oil filter\r\n"
    	 		+ "This is one of the best examples of preventive maintenance to improve performance. It flushes the dirt and debris out of the engine and prevents it from seizing up when driving.\n");
    	 
    	 if ("hondai".equals(getBrand()) || "maruti".equals(getBrand()) || "honda".equals(getBrand()) || "mahindra".equals(getBrand()) || "tata".equals(getBrand())) {
    	      service_price=3500;
    	      sprice+=service_price;
    		System.out.println("servicing price of th car is "+service_price);
    	}
    	else {
           service_price=6800;
           sprice+=service_price;
           System.out.println("servicing price of the car is "+service_price);
    	}
    	break;
    	
     case 5:
    	 System.out.println("\ncar washing:-"
    		+"\nA car wash, or auto wash, is a facility used to clean the exterior,"
    		+ "\n and in some cases the interior, of cars."
    		+"\n two type of washing:-"
    		+"\n 1.external washing"
    		+"\n 2.internal washing");
   
    	    sc.nextLine();

    	    System.out.println("enter the type of washing:-");
    	    int washingtype = sc.nextInt();
    	    if (washingtype==1) {
    	        service_price = 800;
    	        sprice+=service_price;
    	        System.out.println("servicing price of the car is " + service_price);
    	    } else if (washingtype==2) {
    	        service_price = 500;
    	        sprice+=service_price;
    	        System.out.println("servicing price of the car is " + service_price);
    	    } else {
    	        service_price = 1000;
    	        sprice+=service_price;
    	        System.out.println("servicing price of the car is " + service_price);
    	    }
    	    break;

    	
    	default:
    		System.out.println("\ntheir is nothing we can do for you."
    				+"\nsorry for inconvinence");	
     }   
 	System.out.println("do you want more service:-y or n");
    input=sc.next().toLowerCase().charAt(0);
 }  while(input=='y'|| input=='Y');  
     
 }
}



//ServiceCenter class encapsulating the service operations
class ServiceCenter extends customer{

 public ServiceCenter(String name, long contact_no,String payment_method) {
		super(name, contact_no,payment_method);
	}
 
 

public void performService(Vehicle vehicle) {
     System.out.println("Service center is servicing: " + vehicle);
      
     vehicle.performService();
 }

public void generateBill(int totalAmount) {
	 System.out.println(" ");
	 System.out.println("******************************************************************************************");
    System.out.println("Billing Details:");
    System.out.println(" ");
    System.out.println("Customer Name: " + getName());
    System.out.println(" ");
    System.out.println("Contact Number: " + getContact_no());
    System.out.println(" ");
    System.out.println("Payment Method: " + getPayment_method());
    System.out.println(" ");
    System.out.println("Total Amount: " + totalAmount);
}
}





public class Atomobileservices {
	
	
 public static void main(String[] args) {
	
	  String brand,name,payment_method;
	  String model;
	  int year;
	  long contact_no;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("   _______\r\n"
		                + " //  ||  \\\\_____\r\n"
		                + "//   ||   ||    \\\r\n"
		               + "      ||   ||    ||\r\n"
		               + "      ||   ||    ||\r\n"
		+ 	 "WELCOME TO THE ABHISHEK AUTOMOBILE SERVICE CENTER");
	  
	 
	   System.out.print("Enter the customer name: ");
       name = sc.next();

       System.out.print("Enter the customer phone number: ");
       contact_no = sc.nextLong();

       System.out.print("Enter the payment method of customer: ");
       payment_method = sc.next();

       sc.nextLine(); // Consume the newline character

       System.out.print("Enter the brand name of the car: ");
       brand = sc.nextLine();

       System.out.print("Enter the model of the car: ");
       model = sc.nextLine();

       System.out.print("Enter the manufacturing year of the car: ");
       year = sc.nextInt();
	
     Car car = new Car(brand, model, 2023);

    
     ServiceCenter serviceCenter = new ServiceCenter(name,contact_no,payment_method);

   
     serviceCenter.performService( car);
     
     int totalAmount = car.sprice;
     serviceCenter.generateBill(totalAmount);
 }
}
