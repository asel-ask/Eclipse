package day9_ControlFlowStaements_3;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A': case 'B': case 'C':
			System.out.println("Pass");
			break;
		case 'D': case 'F': 
			System.out.println("Fail");
			break;
		
		
		}

	}

}
