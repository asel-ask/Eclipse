package repl_it_part2;
import java.util.Scanner;
public class N_109_ArraysFirstTreeChars {

	public static void main(String[] args) {

		 
		 
				Scanner input = new Scanner(System.in);
				String[] arr = new String[5];
				for (int i=0;i<5;i++)
				{
					arr[i] = input.nextLine();
				}
				//leave above alone! :)   
				//assume you have String array of 5 items 
				//write your code below
				for(String value : arr){
				  System.out.println(value.substring(0,3));
				}
				
		 
	}

}
