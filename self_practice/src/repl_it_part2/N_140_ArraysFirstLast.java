package repl_it_part2;
import java.util.*;
public class N_140_ArraysFirstLast {

	public static void main(String[] args) {


	 
	
	 
	   
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	
	    //TODO: Write your code below
	    String [] str=new String[words.length];
	    for(int i=0;i<words.length;i++){
	      str[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
	    }
	    System.out.println(Arrays.toString(str));
	
	
	
	
	}
	

}
