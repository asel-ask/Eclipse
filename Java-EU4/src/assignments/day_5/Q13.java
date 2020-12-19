package assignments.day_5;

public class Q13 {

	public static void main(String[] args) {
		char c1='W',c2='B';
		for(int i=0;i<8;i++) {
			for(int k=0;k<8;k++) {
				int out=i+k;
				if(out%2==0) {
					System.out.print(c1+" ");
				}else {
					System.out.print(c2+" ");
				}
			}System.out.println();
		}



	}

}
