package assignments.day_5;

public class Q12 {

	public static void main(String[] args) {
		


		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				sum+=i;
				System.out.print(sum + " ");
			}
			sum=0;
			System.out.println();
		}

	}

}
