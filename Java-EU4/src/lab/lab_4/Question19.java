package lab.lab_4;

public class Question19 {

	public static void main(String[] args) {
		 	
		int[] x = {1,2,2} ;
		int[] y = {1, 2, 2, 6, 99, 99, 7} ;
		int[] a = {1,1,6,7,2} ;
		int[] b = {1,1,6,2} ;
		int[] c = {1,2,2,6,99,99,7,3,4} ;
		System.out.println(sum(x));
		System.out.println(sum(y));
		System.out.println(sum(a));
		System.out.println(sum(b));
		System.out.println(sum(c));

	}
	public static int sum(int[] arr) {
		
		int sum=0;
		boolean checkSix=false;
		for(int i=0;i<arr.length;i++) {
			
			if(checkSix ) {
				if(arr[i]==7) {
					checkSix=false;
				}
				
			}else if(arr[i]==6) {
				checkSix=true;
			
			}else {
				sum+=arr[i];
			}

		
		}
			return sum;
	}
}
