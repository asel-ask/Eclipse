package assignments.day_4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the weight of a package");
		double pounds=s.nextInt();
		double shippingRate=0;
		System.out.println("Please enter miles");
		int miles=s.nextInt();
		if(miles<=500) {
			if(pounds<=2) {
				shippingRate=1.1;
			}else if(pounds>2 && pounds<=6) {
				shippingRate=2.20;
			}else if (pounds>6 && pounds<=10) {
				shippingRate=3.70;
			}else 
				shippingRate=3.80;
			} else {
				if(pounds<=2) {
					shippingRate=1.1*2;
				}else if(pounds>2 && pounds<=6) {
					shippingRate=2.20*2;
				}else if (pounds>6 && pounds<=10) {
					shippingRate=3.70*2;
				}else 
					shippingRate=3.80*2;
			}
		
		System.out.println("Shipping charges : $"+shippingRate);
		
		}
		
		

	}


