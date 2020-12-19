package lab.lab_4;

public class Question25 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {2,3,10};
		System.out.println(array2(x, y));
		int[] x1 = {1,2,3};
		int[] y1 = {2,3,5};
		System.out.println(array2(x1, y1));

	}
		public static int array2(int[] arr1, int [] arr2) {
			int count=0;
			for(int i=0;i<arr2.length;i++) {
				if(arr2[i]-arr1[i]==2 || arr2[i]-arr1[i]==1) {
						count++;
					}
				}	return count;
		
		
			
		
}
	}