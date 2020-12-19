package assignments.day_9;
import java.util.*;
public class CarInsuranse {

	public static void main(String[] args) {

	
		    //DO NOT CHANGE
		    double premium = 0;
				int accidentsAmount = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to the CountyFarm car insurance!");
		    //WRITE YOUR CODE HERE
		    System.out.println("Enter your name");
		    name=scan.nextLine();
		    System.out.println("Do you have a US driver license?");
		    String license=scan.next();
		    if(license.equalsIgnoreCase("No")) {
		    	System.out.println("Invalid data!");
		    	System.exit(0);
		    }
		    
		    System.out.println("Enter your zip code");
		    int zipCode=scan.nextInt();
		    if(zipCode==20910 || zipCode==20740) {
		    	premium+=60;
		    }else if(zipCode==22102 || zipCode==22103) {
		    	premium+=30;
		    }else 
		    	premium+=50;
		    
		    System.out.println("Is this vehicle Owned, Financed, or Leased?");
		    vehicleOwnership=scan.next();
		    if(vehicleOwnership.equals("Owned")) {
		    	premium+=10;
		    }else 
		    	premium+=20;
		    
		    System.out.println("How is this vehicle primarily used?");
		    vehicleUsage=scan.next();
		    if(vehicleUsage.equals("Business")) {
		    	premium+=50;
		    }else if(vehicleUsage.equals("Pleasure")) {
		    	premium+=10;
		    }else if(vehicleUsage.equals("Commute")) {
		    	premium+=20;
		    System.out.println("Days Driven To Work And/Or School");
		    daysDrivenToWorkOrSchool=scan.nextInt();
		    premium=premium+daysDrivenToWorkOrSchool*5;
		    
		    System.out.println("Miles Driven To Work And/Or School");
		    milesToWorkOrSchool=scan.nextInt();
		    premium=premium+(milesToWorkOrSchool*1);
		    }
		    		
		    
		    System.out.println("How old are you?");
		    int age=scan.nextInt();
		    if(age<16) {
		    	System.out.println("Invalid data!");
		    	System.exit(0);
		    }else if(age>=16 && age<18) {
		    	premium=premium*20;
		    }else if(age>=18 && age<=21) {
		    	premium=premium*6;
		    }else if(age>21 && age<25) {
		    	premium=premium*2;
		    }
		    
		    System.out.println("How many years you've been driving?");
		    int yearsOfDriving=scan.nextInt();
		    if(yearsOfDriving>0 && age-yearsOfDriving>=16) {
		    	premium=premium-(yearsOfDriving*5);
		    }else {
		    	System.out.println("Invalid data!");
		    	System.exit(0);
		    }
		    
		    System.out.println("Have you had any accidents in the last 5 years?");
		    String accidents=scan.next();
		    if(accidents.equalsIgnoreCase("Yes")) {
		    	System.out.println("How many?");
		    	accidentsAmount=scan.nextInt();
		    	if(accidentsAmount>0) {
		    		premium=premium+accidentsAmount*(premium*0.20);
		    	}
		    }
		    System.out.println("Have you had continuous insurance for the past 12 months?");
		    continuousInsurance=scan.next();
		    if(continuousInsurance.equals("No")) {
		    	premium=premium*2;
		    }
		    education=scan.nextLine();
		    System.out.println("What is the highest level of education you have completed?");
		    education=scan.nextLine().replace(" ", "");
		    if(education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
		    	premium=premium-(premium*0.05);
		    }else if(education.equals("Doctors")) {
		    	premium=premium-(premium*0.10);
		    }else {
		    	premium=premium+(premium*0.05);
		    }
		    referenceNumber=(name.substring(0,2).toUpperCase()+age+name.substring(name.length()-2).toUpperCase()+zipCode+education).toUpperCase();
		    System.out.println(name+", here's your quote!");
		    System.out.println("Start Your Policy Today For: $"+premium);
		    System.out.println("Reference number: "+referenceNumber);
		  
		System.out.println();

	}

}
