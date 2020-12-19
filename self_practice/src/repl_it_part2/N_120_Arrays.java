package repl_it_part2;
import java.util.*;
class N_120_Arrays {

	public static void main(String[] args) {
		 

		 
			  Scanner input = new Scanner(System.in);
				String[] words = new String[5];
				for(int i = 0; i < 5;  i++) {
				  
				  words[i] = input.nextLine();
				  
				}
				
				//write your code below
				int longest=words[0].length();
				String largest=words[0];
				for(int i=0;i<words.length;i++){
				  if(words[i].length()>longest){
					  largest=words[i];
				  }
				}System.out.println(largest);
				  
				 
	}

}
