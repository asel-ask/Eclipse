package day11_controlFlowStatements_5;

public class NestedForLoop_2 {

	public static void main(String[] args) {
		
		
		for (int i=0; i<3; i++) {
			System.out.println("Outer Loop at state:"+i);
			for(int p=0;p<=3;p++) {
				System.out.println("Inner Loop at state:"+p);
				if(p==3) {
					System.out.println();
				}
			}
		}

	}

}
