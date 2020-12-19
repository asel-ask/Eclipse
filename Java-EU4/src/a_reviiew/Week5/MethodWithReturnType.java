package a_reviiew.Week5;

public class MethodWithReturnType {

	public static void main(String[] args) {
		
		int result = getSumOFNumberFrom1to100();
		System.out.println(result);
		System.out.println( getSumOFNumberFrom1to100());
		 
		
		int result1=getSumOFNumberFrom1toN(100);
		int result2=getSumOFNumberFrom1toN(10);
		int result3=getSumOFNumberFrom1toN(55);
		
				System.out.println("Sum from 1 to 100 "+result1);
				System.out.println("Sum from 1 to 10  "+result2);
				System.out.println("Sum from 1 to 55  "+result3);
				
		int result4=getSumOFNumberFrom1toN(-1);
		
				System.out.println("Sum from 1 to -1  "+result4);
		
		
	}
	
	public static int getSumOFNumberFrom1toN(int endingNumber) {
		
		int sum=0;
		
		for(int i=1; i<=endingNumber; i++) {
			sum+=i;
			 
		}
		return sum;
	}
	
	public static int getSumOFNumberFrom1to100() {
		
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			
			sum+=i;
		}
			 
			return sum;

	}
}
