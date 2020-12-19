package day30_wrapperClass;

public class boxing {

	public static void main(String[] args) {

		//AUTOBOXING --> primitive to object
		Integer num1=1234;
		int n=5;
		Integer num2=n;
		System.out.println(num2);
		
		//UNBOXING --> Object to primitive
		Double d1= new Double(34.2); //no boxng
		double d2=d1;				 //unboxing
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		long l1=new Long(6000000L);	// unboxing
		Long l2=new Long(345644548);//no boxng
		
		long l3=l2;     //unboxing
		
		System.out.println(l3);
		
		Integer num3=Integer.valueOf(345);
	//--->	Double d3=num3; // casting not possible with wrapper classes
		
		
	}

}
