package a_reviiew.Week4;

public class LoopIntro {

	public static void main(String[] args) {


//		int x=10;
//		
//		while (x>0) {
//			System.out.println("do something here");
//		}
		
		int x=0;
		while (x<=10) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println();
		
		int y=0;
		
		//do while loop
		do {
			System.out.print(y+" ");
			y++;
		}while(y<=10);

		System.out.println();
		
		for(int i=0;i<=10;i++) {
			
			System.out.print(i+" ");
			 
		}
	}

}
