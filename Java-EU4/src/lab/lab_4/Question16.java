package lab.lab_4;

public class Question16 {

	public static void main(String[] args) {

		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0} ;
		int[] z = {1,3,5} ;
		System.out.println(countOfEvem(x));
		System.out.println(countOfEvem(y));
		System.out.println(countOfEvem(z));

	}
	public static int countOfEvem(int[] arr) {
		int count=0;
		for(int value : arr) {
			if(value%2==0) {
				count++;
			}
		}
		return count;
		
		
		
		
		
		
		
		
		
	}
}
