package a_reviiew.Week8;

public class UniqueFromArray {

	public static void main(String[] args) {
		
		int[] x= {1,2,3,1,2,4};
		
		uniqueValues(x);

	}
	public static void uniqueValues(int [] nums) {
		
		for(int eachNum : nums) {
			
			int count=0;
			
			for(int eachInnerNum : nums) {
				
				if(eachNum==eachInnerNum) {
					count++;
				}
			}
				if(count==1) {
					System.out.println(eachNum);
				}
			
		}
		
		
		
	}
}
