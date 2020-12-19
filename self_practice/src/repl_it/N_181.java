package repl_it;

public class N_181 {

	public static void main(String[] args) {
		 
			  System.out.println(wordCount("one two three four"));

	}
	 	public static int wordCount(String words) {
	      int count=0;
	      for (int i=0;i<words.length();i++){
	        if(words.substring(i,i+1).equals(" ")){
	          count++;
	        }
	      } return count+1;
	  }
	  
	
}
