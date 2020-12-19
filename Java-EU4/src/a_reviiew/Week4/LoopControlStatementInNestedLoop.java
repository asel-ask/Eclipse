package a_reviiew.Week4;

public class LoopControlStatementInNestedLoop {

	public static void main(String[] args) {
		
//		outer:
//		for(int row=1; row<=5;row++) {
//			 
//			for (int col=1; col<=5;col++) {
//				System.out.print(col+ " ");
//				if(col==4) {
//				 break outer;
//			}
//			}System.out.println();
//			}
//		
	
	
		outer:
		for(int row=1; row<=5;row++) {
			  for (int col=1; col<=5;col++) {
				 
				if(col==3) {
					continue;
				}
				System.out.print(col+ " ");
				
			}System.out.println();
			}

	}

}
