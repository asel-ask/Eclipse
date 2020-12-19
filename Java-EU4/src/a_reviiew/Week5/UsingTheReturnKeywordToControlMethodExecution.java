package a_reviiew.Week5;

public class UsingTheReturnKeywordToControlMethodExecution {

	public static void main(String[] args) {

		printVotingEligibility(19);
		printVotingEligibility(-1);
		printVotingEligibility(200);

	}
		//return keyword has 2 usage:
			//return a value from a non void method
			//exit from the method when the line is reached
	public static void printVotingEligibility(int age ) {
		
		if(age < 0 || age > 100) {
			System.out.println("Invalid number");
			return ;
		}
		
		
		if(age>18) {
			System.out.println("You are eligible to vote");
		}else 
			System.out.println("You are not eligible");
		
		System.out.println("This is the end");
	}
	
}
