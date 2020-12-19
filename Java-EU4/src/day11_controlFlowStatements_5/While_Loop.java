package day11_controlFlowStatements_5;

public class While_Loop {

	public static void main(String[] args) {
		 
		//print 0-10
		
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//using a Loop,iterate until we have 10 students
		
		int numberOfStudent=1;
		
		while(numberOfStudent<=10) {
			System.out.println("Student "+numberOfStudent);
			numberOfStudent++;
		}
		
		//print 11,10,9,8 etc
		
		int num=11;
		while (num>=1) {
			System.out.print(num+" ");
			num--;
		}

	}

}
