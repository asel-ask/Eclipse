package lab.lab_4;

public class Question27 {

	public static void main(String[] args) {
		 
		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		
		System.out.println(threeAdjacent(x));
		System.out.println(threeAdjacent(y));
		System.out.println(threeAdjacent(z));

	}
	public static boolean threeAdjacent(int [] arr) {
		int num=1;
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]==num && arr[i+1]==num+1 && arr[i+2]==num+2) {
				return true;
			}
			
		}
				return false;
		
	}
}
