package lab.lab_4;

public class Question22 {

	public static void main(String[] args) {
		
		int[] x = {1,4,1} ;//true
		int[] x1 = {1,4,1,4}; //false
		int[] x2 = {1,1}; //true
		
		System.out.println(greater(x));
		System.out.println(greater(x1));
		System.out.println(greater(x2));

	}
	public static boolean greater(int[] nums) {
		
		int count1=0;
		int count4=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count1++;
			}else if(nums[i]==4) {
				count4++;
			}
		}
		if(count1>count4) {
			return true;
		}
			return false;
	}
}
