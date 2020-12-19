package lab.lab_4;

public class Question12 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,3} ;
		
		int[] z = {7,2,3};
		int[] v = {1} ;
		
		int[] i = {3,2,4};
		int[] j = {4,3,4} ;
		
		System.out.println(ones(x, y));
		System.out.println(ones(z, v));
		System.out.println(ones(i, j));
	}
	
	public static int ones(int[] arr1,int[] arr2) {
		
		int count=0;
		if(arr1[0]==1) {
			count++;
		} 
		if(arr2[0]==1){
			count++;
		}
		 return count;
	}

}
