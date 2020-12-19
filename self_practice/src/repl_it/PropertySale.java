package repl_it;
import java.util.*;
public class PropertySale {

	public static void main(String[] args) {
		


//    //DO NOT CHANGE
//    int propertyPrice = 0; 
//		int numberOfBedrooms, garageSpots;
//		float metroAccessibility, schoolScore, highwayAccessibility;
//		boolean backyard, smoking, garage;
//		String houseType;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("*****************************************");
//		System.out.println("* Welcome to the RealEstate calculator! *");
//		System.out.println("*****************************************");
//    //WRITE YOUR CODE HERE
//    System.out.println("Enter your property type:");
//    houseType=scan.next();
//    System.out.println("How many bedrooms do you have?"+propertyPrice);
//    numberOfBedrooms=scan.nextInt();
//    System.out.println("Do you have a backyard?"+propertyPrice);
//    backyard=scan.nextBoolean();
//    
//    System.out.println("Do you have garage?"+propertyPrice);
//    garage=scan.nextBoolean();
//    System.out.println("How many spots?"+propertyPrice);
//    garageSpots=scan.nextInt();
//    System.out.println("How close is metro station?"+propertyPrice);
//    metroAccessibility=scan.nextFloat();
//    System.out.println("How close is highway?"+propertyPrice);
//    highwayAccessibility=scan.nextFloat();
//    System.out.println("What's the rating of nearest school?"+propertyPrice);
//    schoolScore=scan.nextFloat();
//    System.out.println("Does any of your family members smoking?"+propertyPrice);
//    smoking=scan.nextBoolean();
//    
//    switch(houseType) {
//    case "Condo":
//         propertyPrice=50000;
//         break;
//    case "TownHouse":
//    	propertyPrice=75000;
//    	break;
//    case "Single Family Home":
//    	propertyPrice=95000;
//    	break;
//    }
//      
//  
//    propertyPrice=propertyPrice+numberOfBedrooms*30000;
//     
//
//      if (backyard=true && houseType.equals("Condo")) {
//    	  System.out.println("Backyard is not available for a condo!");
//      } else {
//    		  propertyPrice=propertyPrice+5000;
//    	  }
//      if(garage){
//          if(garageSpots<=10&&garageSpots>0){
//            propertyPrice=propertyPrice+garageSpots*20000;
//          }else
//          System.out.println(" Pardon,  it's not a public parking!" );
//        }
//      if (metroAccessibility<=1) {
//    	  propertyPrice=propertyPrice+10000;
//      }else if (metroAccessibility>1 && metroAccessibility<3) {
//    	  propertyPrice=propertyPrice+5000;
//      } if (highwayAccessibility<=1) {
//    	  propertyPrice=propertyPrice+15000;
//      }else if (highwayAccessibility>1 && highwayAccessibility<5) {
//    	  propertyPrice=propertyPrice+8000;
//      }else if (highwayAccessibility>5 && highwayAccessibility<=20) {
//    	  propertyPrice=propertyPrice+4000;
//      }if (schoolScore>8 && schoolScore<=10) {
//    	  propertyPrice=propertyPrice+45000;
//      }else if (schoolScore>4 && schoolScore<=8) {
//    	  propertyPrice=propertyPrice+20000;
//      }else {
//    	  propertyPrice=propertyPrice+5000;
//      } if(smoking=true) {
//    	  propertyPrice=propertyPrice-5000;
//      }
//      System.out.println("Market report has been generated.");
//      System.out.println("Your estimate market price is: "+propertyPrice+"$");
		 
		    //DO NOT CHANGE
		    int propertyPrice = 0; 
				int numberOfBedrooms, garageSpots;
				float metroAccessibility, schoolScore, highwayAccessibility;
				boolean backyard, smoking, garage;
				String houseType;
				Scanner scan = new Scanner(System.in);
				System.out.println("*****************************************");
				System.out.println("* Welcome to the RealEstate calculator! *");
				System.out.println("*****************************************");
		    //WRITE YOUR CODE HERE
		    System.out.println("Enter your property type:");
		    houseType=scan.nextLine();
		    switch(houseType) {
		    case "Condo":
		         propertyPrice=50000;
		         break;
		    case "Townhouse":
		    	propertyPrice=75000;
		    	break;
		    case "Single Family Home":
		    	propertyPrice=95000;
		    	break;
		    default: System.out.println("There is no such house type!");
		    }
		    
		    System.out.println("How many bedrooms do you have?"+propertyPrice );
		    numberOfBedrooms=scan.nextInt();
		    if (numberOfBedrooms > 0) {
					propertyPrice += numberOfBedrooms * 30000;
				}
		    
		    System.out.println("Do you have a backyard?"+propertyPrice);
		    backyard=scan.nextBoolean();
		     if (backyard=true && houseType.equals("Condo")) {
		    	  System.out.println("Backyard is not available for a condo!"+propertyPrice);
		      } else {
		    		  propertyPrice=propertyPrice+5000;
		    	  }
		    
		    System.out.println("Do you have garage?"+propertyPrice);
		    garage=scan.nextBoolean();
		     System.out.println("How many spots?"+propertyPrice);
		    garageSpots=scan.nextInt();
		    if(garage){
		      if(garageSpots<=10&&garageSpots>0){
		        propertyPrice=propertyPrice+garageSpots*20000;
		      }else
		      System.out.println(" Pardon,  it's not a public parking!"+propertyPrice );
		    }
		    System.out.println("How close is metro station?"+propertyPrice);
		    metroAccessibility=scan.nextFloat();
		    if (metroAccessibility<=1 && metroAccessibility>0) {
		    	  propertyPrice=propertyPrice+10000;
		      }else if (metroAccessibility>1 && metroAccessibility<3) {
		    	  propertyPrice=propertyPrice+5000;
		      } 
		    
		    System.out.println("How close is highway?"+propertyPrice);
		    highwayAccessibility=scan.nextFloat();
		    if (highwayAccessibility<=1) {
		    	  propertyPrice=propertyPrice+15000;
		      }else if (highwayAccessibility>1 && highwayAccessibility<5) {
		    	  propertyPrice=propertyPrice+8000;
		      }else if (highwayAccessibility>5 && highwayAccessibility<=20) {
		    	  propertyPrice=propertyPrice+4000;
		      }
		      
		    System.out.println("What's the rating of nearest school?"+propertyPrice);
		    schoolScore=scan.nextFloat();
		    if (schoolScore>=8 && schoolScore<=10) {
		    	  propertyPrice=propertyPrice+45000;
		      }else if (schoolScore>=4 && schoolScore<8) {
		    	  propertyPrice=propertyPrice+20000;
		      }else {
		    	  propertyPrice=propertyPrice+5000;
		      }
		      
		    System.out.println("Does any of your family members smoking?"+propertyPrice);
		    smoking=scan.nextBoolean();
		     if(smoking) {
		    	  propertyPrice=propertyPrice-5000;
			      }else {
			    	  propertyPrice=propertyPrice;
		      }
		    
		       System.out.println("Market report has been generated.");
		      System.out.println("Your estimate market price is: "+propertyPrice+"$");
		    } 
			 
		    







	
 
		    } 
			 
		    







    
	 
    






