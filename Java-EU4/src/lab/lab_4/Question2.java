package lab.lab_4;

public class Question2 {

	public static void main(String[] args) {
		 	
		int[] x= {1,2,3};
		int[] y= {1,2,3,1};
		int[] z= {1,2,1};
		int[] k= {1};
		
		System.out.println(equalElements(x));
		System.out.println(equalElements(y));
		System.out.println(equalElements(z));
		System.out.println(equalElements(k));
		
	}
	public static String equalElements(int[] arr) {
		
		if(arr.length<=1) {
			return "not valid array";
		}else {
			if(arr[0]==arr[arr.length-1]) {
				return "true";
			}else
				return "false";
		}
		
	} 
}
