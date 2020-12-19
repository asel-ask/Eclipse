package day25_arrays_part2;

public class SameArray {

	public static void main(String[] args) {

		int [] array1= {2,4,6,8,10};
		int [] array2=array1;
		
		array1[0]=200;
		array2[4]=1000;
		
		System.out.println("The contects of array1: ");
		for(int a1:array1) {
			System.out.println(a1);
		}
		System.out.println("The contects of array2: ");
		for(int a2: array2) {
			System.out.println(a2);
		}
	}

}
