package assignments.day_9;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		double price=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Select screen size: ");
		double size=s.nextDouble();
		if(size==13.3) {
			price+=200;
		}else if(size==15.0) {
			price+=300;
		}else if(size==17.3) {
			price+=400;
		}else 
			System.out.println("Invalid parameters");
		System.out.println("Select CPU type: "+price);
		String cpu=s.next();
		switch(cpu) {
		
		case "i3":
			price+=150;
			break;
		case "i5":
			price+=250;
			break;
		case "i7":
			price+=350;
			break;
			default:
				System.out.println("Invalid parameters");
		}
		System.out.println("Select RAM size: "+price);
		int ram=s.nextInt();
		for(int i=0;i<ram;i++) {
			if(i%4==1) {
				price+=50;
			}
		}
		
		System.out.println("Select storage type: "+price);
		System.out.println("Enter memory size:"+price);
		String storage=s.next();
		int memomy=s.nextInt();
		switch(storage) {
		
		case "SSD":
			for(int i=0;i<memomy;i++) {
				if(i%500==1) {
					price+=100;
				}
			}break;
		case "HDD":
			for(int i=0;i<memomy;i++) {
				if(i%500==1) {
					price+=50;
	        	}
			}break;
			default:
				System.out.println("Invalid parameters");
		}
		
		System.out.println("Enter screen resolution: "+price);
		String screen=s.next();
		
		 switch(screen) {
		 case "FULLHD":
			 price+=100;
			 break;
		 case "4K":
			 price+=200;
			 break;
			 default:
				 System.out.println("Invalid parameters");
		 }
		 
		 System.out.println("Laptop price is: $"+price);
		
	}	
		
	}


