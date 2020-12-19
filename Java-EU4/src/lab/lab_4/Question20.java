package lab.lab_4;

public class Question20 {

	public static void main(String[] args) {
		 
		int[] x = {1,2,2} ;
		int[] y = {1, 2, 1,2} ;
		int[] a = {2,1,2} ;
		int[] b = {2,2,2,2};
		System.out.println(twos(x));
		System.out.println(twos(y));
		System.out.println(twos(a));
		System.out.println(twos(b));
		

	}
	public static boolean twos(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==2 && arr[i+1]==2) {
				return true;
			}
		}
			return false;
	}
}
