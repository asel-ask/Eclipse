package day7_controlFlowStatements;

public class small_tasks2 {

	public static void main(String[] args) {
		
		//1st Write an if-else statement that assigns 20 to variable y if the variable x greater than 100.  
		//Otherwise, it should assign 0 to the variable y
		
		int y=30, x=65;
		
		
		if(x>100) {
			y=20;
			System.out.println("Y is equal to "+y);
		}else { 
			y=0;
			System.out.println("Y is equal to "+y);
		} 
			System.out.println("******************");
		
		//2nd Write an if-else statement that assigns 1 to a when b is equal to 100.
		//Otherwise, it should assign 0 to a.
		
		int a=3,b=200;
		if(b==100) {
			a=1;
			System.out.println("A is equal to "+a);
		} else { 
			a=0;
			System.out.println("A is equal to "+a);
		} 
			System.out.println("********************");
		
		//3rd Write an if-else statement that assigns 0 to the variable b1 and assigns 1 to the variable c
		//if the variable a1 is less than 10. otherwise, it should assign -99 to the variable b1 and assign 0
		//to the variable c
		
		int a1=20, b1=0, c=0;
		
		if(a1<10) {
			b1=0;
			c=1;
			System.out.println("b1 = "+b1+" c = "+c);
		} else { 
			b1=-99; c=0;
			System.out.println("b1 = "+b1+" c = "+c);
		}
		
	}

}
