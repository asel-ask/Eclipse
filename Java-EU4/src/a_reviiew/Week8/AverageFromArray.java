package a_reviiew.Week8;

public class AverageFromArray {

	public static void main(String[] args) {
		 
		int [] arr= {1,5,8,46,67};
		System.out.println(getAverage(arr));
		double [] arr1= {52,47,99,-5,0,5};
		System.out.println(getAverage(arr1));

	}
	public static int getAverage(int[] arr) {
		
		int sum=0;
		for(int num: arr) {
			sum+=num;
		}
		return sum/arr.length;
	}
	public static double getAverage(double[] arr) {
			
			double sum=0;
			for(double num: arr) {
				sum+=num;
			}
			return sum/arr.length;
		}
}
