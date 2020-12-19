package lab.lab_4;

public class Question4 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3}; 
		int[] y = {5,11,2}; 
		int[] z = {7,0,0}; 
		int[] a = {3,-2,10,4};  
		System.out.println(sumOfElements(x));
		System.out.println(sumOfElements(y));
		System.out.println(sumOfElements(z));
		System.out.println(sumOfElements(a));
		
		
	}
	public static int sumOfElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
