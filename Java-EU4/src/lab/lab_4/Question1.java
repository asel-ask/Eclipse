package lab.lab_4;
public class Question1 {
	public static void main(String[] args) {
		
		
		int [] x= {1,2,6};
		int[] y= {6,1,2,3};
		int[] z= {13,6,1,2,3};
		
		System.out.println(love6(x));
		System.out.println(love6(y));
		System.out.println(love6(z));
	}
	public static boolean love6(int []nums) {
		
		if(nums.length<1) {
			return false;
		}
		
		if(nums[0]==6 || nums[nums.length-1]==6) {
			return true;
		}else 
		return false;
		
	}
}
