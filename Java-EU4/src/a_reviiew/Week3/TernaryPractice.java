package a_reviiew.Week3;

public class TernaryPractice {

	public static void main(String[] args) {


		// anything that ternary operator can do, if else statement can do it!!!
	//	String amOrPm="";
		int hour =11;
		
//		if(hour>12) {
//			amOrPm="PM";
//		}else {
//			amOrPm="AM";
//		}
		//syntax for ternary operator
		//DataType variable=(condition here) ? IfTrueAssignThis : IfFalseAssignThis
		
	//     String	amOrPm     =    (hour>12)     ?    "PM"     :         "AM";
	     
	  String amOrPm= (hour>12 && hour<24) ? "PM" : "AM";
	  
		System.out.println("It is "+amOrPm);
		
		int num1=10;
		int num2=20;
		int biggerNumber=0;
		
//		if(num1 > num2) {
//			biggerNumber=num1;
//		}else {
//			biggerNumber=num2;
//		}

		biggerNumber=(num1>num2)? num1: num2;
		System.out.println("greater number is: "+biggerNumber);
	}

}
