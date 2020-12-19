package day11_controlFlowStatements_5;

public class Task51_SimulateClock {

	public static void main(String[] args) {


		for(int i=0,z=43; i<=17;i++,z++) {
			for(int b=0; b<1;b++) {
				System.out.print("01:00:"+i+" ");
				System.out.println("	12:59:"+z);
			}
			
		}

	}

}
