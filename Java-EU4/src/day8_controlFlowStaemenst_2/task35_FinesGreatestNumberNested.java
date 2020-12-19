package day8_controlFlowStaemenst_2;

public class task35_FinesGreatestNumberNested {

	public static void main(String[] args) {


		int n1=10;
		int n2=20;
		int n3=100;
		
		//find the greatest by using nested if  
		
		if(n1>n2&&n1>n3) {
			System.out.println("N 1 is biggest");
		}else {
			if(n2>n3) {
				System.out.println(" N 2 is biggest");
			}else {
				System.out.println(" N 3 is biggest");
			}
		} 
		}

	}


