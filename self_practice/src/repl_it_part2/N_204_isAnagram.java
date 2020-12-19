package repl_it_part2;

public class N_204_isAnagram {
 
		  public static boolean isAnagram(String word1, String word2) {
		   
		    if(word1.length()!=word2.length()){
		      return false;
		    }
		    for(int i=0;i<word1.length();i++){
		    	char w1=word1.toUpperCase().replace(" ","").charAt(i);
		      word2=word2.toUpperCase().replace(" ","").replaceFirst(""+w1, "");
				}
				
				return word2.isEmpty();
		    }
		  public static void main(String[] args) {
			
			  System.out.println(isAnagram("Listen", "Silent"));
			  
		}

}
