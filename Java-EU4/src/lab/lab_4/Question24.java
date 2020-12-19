package lab.lab_4;

public class Question24 {

	public static void main(String[] args) {

		int[] x = {1, 2, 1, 3};
		int a = 2;
		System.out.println(next2(x, a));
		int[] x1 = {1, 2, 1, 3};
		int a1 = 1;
		System.out.println(next2(x1, a1));

	}
		public static boolean next2(int[] arr,int num) {
			
			for(int i=0;i<arr.length-2;i++) {
				if(arr[i]==num && arr[i+1]==num || arr[i+2]==num) {
					return true;
				}
			}
			
			return false;
			
			
		}
}
