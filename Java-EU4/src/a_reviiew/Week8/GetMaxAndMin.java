package a_reviiew.Week8;
import java.util.Arrays;
	public class GetMaxAndMin {

		public static void main(String[] args) {
		int [] arr = {31,4,1,80, 500,3};
		System.out.println(Arrays.toString(getMinAndMax(arr)));
		System.out.println(Arrays.toString(getMinAndMax2(arr)));
		
	}
		public static int[] getMinAndMax(int[] arr) {
			
			int [] result= {arr[0],arr[0]};
			
			for(int num : arr) {
				if(num<result[0]) {
					result[0]=num;
				}
				if(num>result[1]) {
					result[1]=num;
				}
				
			}
			return result;
			
		}
		
		public static int[] getMinAndMax2 (int[] arr) {
			
			Arrays.sort(arr);
			
			//return new int []{arr[0], arr[arr.length-1]};
			return new int []{arr[1], arr[arr.length-2]};
			
		}
}
