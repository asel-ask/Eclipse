package lab.lab_4;

public class Question18 {

	public static void main(String[] args) {

		int[] x = {1,2,2,1};
		int[] y = {1,1} ;
		int[] a = {1,2,2,1,13} ;
		int[] b = {1,2,2,1,13,3} ;
		System.out.println(sumExcept13(x));
		System.out.println(sumExcept13(y));
		System.out.println(sumExcept13(a));
		System.out.println(sumExcept13(b));

	}
	public static int sumExcept13(int[] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=13) {
			sum+=arr[i];
			}else 
				break;
		}
			return sum;
		
		
	}
}
