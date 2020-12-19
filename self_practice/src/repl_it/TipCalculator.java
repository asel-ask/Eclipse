package repl_it;
import java.util.*;
public class TipCalculator {

	public static void main(String[] args) {
		 

		
		
		  Scanner scan=new Scanner(System.in);
				
				System.out.println("Split:");
				String split=scan.next();
				
				System.out.println("Number of people:");
				int numberOfPeople=scan.nextInt();
				
				System.out.println("Check amount:");
				double amount=scan.nextDouble();
				
				System.out.println("Service Quality:");
				String serviceQuality=scan.next();
				
				double totalTip=0;
				double totalPay=0;
				double totalPerPerson=0;
				double tipPerPerson=0;
				
				// WRITE YOUR CODE HERE
				
				if(serviceQuality.equals("Poor")){
				  totalTip=(amount*0.05);
				}else if(serviceQuality.equals("Fair")){
				  totalTip=(amount*0.10);
				}else if(serviceQuality.equals("Good")){
				  totalTip=(amount*0.15);
				}else if(serviceQuality.equals("Great")){
				  totalTip=(amount*0.20);
				}else if(serviceQuality.equals("Excellent")){
				  totalTip=(amount*0.25);}
				System.out.print("Number of people entered: ");
				  for(int i=0 ;i<numberOfPeople  ; i++){
				    System.out.print("&");}
				  System.out.println();
				  
				   
				
						
						totalPay=amount+totalTip;
						System.out.println("Total to pay: "+totalPay);
						System.out.println("Total tip: "+totalTip);
						totalPerPerson=totalPay/numberOfPeople;
						System.out.println("Total per person: "+totalPerPerson);
						tipPerPerson=totalTip/numberOfPeople;
						System.out.println("Tip per person: "+tipPerPerson);
						
						
						
				  }
				

			}



				
				
				
		  
