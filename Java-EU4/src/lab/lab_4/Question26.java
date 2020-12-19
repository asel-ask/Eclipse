package lab.lab_4;

public class Question26 {

	public static void main(String[] args) {
		 
		int x[] = {2,1,3,5}; //true
		int y[] = {2,1,2,5}; //false
		int z[] = {2,4,2,5}; //true	
		
		System.out.println(oddsEvens(x));
		System.out.println(oddsEvens(y));
		System.out.println(oddsEvens(z));

	}
	public static boolean oddsEvens(int[] arr) {
		
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0 ||
			   arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) {
				
				return true;
			}
	}
		return false;
		
		
	}
}
