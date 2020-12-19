package day6_logicalOperators;

public class operatorPresedence {

	public static void main(String[] args) {

		int appleCount=20;
		int orangeCount=30;
		int pearsCount=30;
		
		boolean comp= appleCount<orangeCount||orangeCount>=pearsCount;
		
		// 20 < 30 || 30 >= 30 => T || ----=>True
		
		System.out.println(comp);
		System.out.println("****************");
		
		String outsideWeather;
		int degree;
		outsideWeather="Shiny";
		degree=70;
		boolean comp2= (!(outsideWeather=="Rainy"||degree==70)); //(!(F || T)) ---> False
		
		System.out.println(comp2);
		System.out.println("******************");
		
		int b=2;
	
		boolean res= ++b==2||--b==2&&--b==2;
		//b in memory: 2=>3 
		//result : 3==2||2==2&&1==2 ---->F || T && F ----> T && F----> False
		System.out.println(res);
		
		System.out.println("******************");
		
		
		boolean x= true, z=true;
		int y= 20;
		x= (y!=10)||(z=false);
		
		
		System.out.println(x);
		
		System.out.println("**********************");
		
		double d1=20;
		double d2=80;
		double d3=(d1+d2)*25;
		System.out.println(d3); 
		double remainder=d3%40;

		System.out.println(remainder);
		System.out.println("Remainder total is equal to 20 or less?- "+(remainder<=20));
		
		
		
		
	}

}
