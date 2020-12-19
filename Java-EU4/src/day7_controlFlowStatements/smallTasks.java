package day7_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
	
		//1.task
		
		int x=10;
		int y=20;
		if(y==20) {
			x=5;
			
		}
		
		System.out.println("x = "+x+" y = "+y);
		
		//2.task an if statement that multiplies payrate by 1.5 if hours greater than 40
		
		double payrate=1000;
		int hours=40;
		
		if(hours>40) {
			payrate=payrate*1.5;
			
		}
		
		System.out.println("Payrate is "+payrate);
		
		//3.task
		
		boolean max=true;
		int fee=20;
		if(max==true) {
			
			fee=50;
		}
		System.out.println("Fee is "+fee);

		//4.task 
		
		int a=100;
		int b=60;
		int c=300;
		if(b==50&&c>=100) { // false && true => false
			a=20;
			}
		System.out.println("a = "+a);
		
		//5.task
		
		int temp=65;
		if(temp>=70&&temp<80) {
			System.out.println("Ideal Temp");
		}
		System.out.println("Not Ideal Temp");
	}

}
