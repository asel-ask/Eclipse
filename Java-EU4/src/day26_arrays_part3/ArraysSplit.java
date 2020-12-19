package day26_arrays_part3;

import java.util.Arrays;

public class ArraysSplit {

	public static void main(String[] args) {

		String str="It will display the array of the size";
		String [] arr=str.split(" ");
		System.out.println(arr.length);
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		System.out.println("-------------------------");
		// Task 93
		
		String sentence="As he crossed toward the pharmacy at the corner he involuntarily "
				+ "turned his head because of a burst of light that had ricocheted from his temple, "
				+ "and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly"
				+ "white parallelogram of sky being unloaded from the van—a dresser with mirrors across"
				+ "which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding "
				+ "and swaying not arboreally, but with a human vacillation, produced by the nature of those "
				+ "who were carrying this sky, these boughs, this gliding façade.";
		
		String [] array=sentence.split(" ");
		System.out.println(array.length);
		
		System.out.println(array[82]);
		System.out.println(array[77]);
		
//		for(String value : array) {
//			System.out.println(value);
//		}
	}

}
