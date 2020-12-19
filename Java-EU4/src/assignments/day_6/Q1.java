package assignments.day_6;

public class Q1 {

	public static void main(String[] args) {


		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		for(int i=7-1;i>=0;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}

	}

}
