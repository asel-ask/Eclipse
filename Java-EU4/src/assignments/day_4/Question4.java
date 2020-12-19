package assignments.day_4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {


		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter monthly calls count: ");
		double payment = 200;
		int calls=s.nextInt();
		int count=0;
		double count2=0,count3=0;
			if(calls<=100) {
				payment=200;
				
			}else if(calls>100 && calls<=150){
				count=calls-100;
				payment=payment+count*0.60;
				
			}else if(calls>150 && calls<=200) {
				count=calls-150;
				count2=50*0.6;
				payment=payment+count2+(count*0.50);
				
			}else {
				count=calls-200;
				count2=50*0.6;
				count3=50*0.5;
				payment=payment+count2+count3+count*0.40;
				}
			 
		System.out.println("Your monthly telephone bill is : "+payment);
//		int counts =0;
//		  if (calls>100 && calls<=150) {
//			 counts= calls%100;
//			  payment = payment + counts*0.6;
//			  }
//		  if (calls<=200) {
//			  counts = calls%150;
//			  payment = 230 + counts*0.5;
//		      }
//		  if (calls>200) {
//			  counts = calls-200;
//			  payment = 255 + counts*0.4;
//		  }
//		 
//		System.out.println("Your monthly telephone bill is : "+payment);
//		

	}

}
