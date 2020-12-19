package day8_controlFlowStaemenst_2;

public class Task39_TraficLights {
	
	public static void main(String[] args) {
		
	 char trafficLight='O';
	 
	 switch (trafficLight) {
	 
	 case 'R': case'r':
		 System.out.println("Red");
		 break;
	 case 'O': case 'o':
		 System.out.println("Orange");
		 break;
	 case 'G':case 'g':
		 System.out.println("Green");
		 break;
	default:
		System.out.println("Invalid");
		break;
	 
	 
	 }	
		
	}
	
}
