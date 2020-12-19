package lab.lab_4;

public class Question21 {
	
	public static void main(String[] args) {
		
		int[] x = {2, 3, 2, 2, 4, 2} ;
		int[] x1 = {2, 3, 2, 2, 4, 2, 2};
		int[] x2 = {1, 2, 3, 4} ;
		
		System.out.println(sum8(x));
		System.out.println(sum8(x1));
		System.out.println(sum8(x2));
		
	}
	
	public static boolean sum8(int[] num) {
		
		int sum=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==2) {
				sum+=num[i];
			}
		}
			if(sum==8) {
				return true;
			}
				return false;
		
	}
}
