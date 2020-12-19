package day27_arrays_part4;

public class Task95_2DArray {

	public static void main(String[] args) {

		int [][] scores= {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		double sum=0;
		for(int avgr : scores[0]) {
			 sum+=avgr;
		}System.out.println(sum/scores[0].length);
		
//		for(int i=0;i<scores[0].length;i++) {
//			sum+=scores[0][i];
//		}System.out.println(sum/scores[0].length);
		
		double sum2=0;
		for(int [] math : scores) {
			sum2=sum2+math[0];
		}  System.out.println(sum2);
		
//		for(int i=0;i<scores.length;i++) {
//			sum2+=scores[i][0];
//		}System.out.println(sum2);
		
		
		
		
		
	}
	
}
