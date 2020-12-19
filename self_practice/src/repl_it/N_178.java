package repl_it;

public class N_178 {

	public static void main(String[] args) {
		 System.out.println(mergeStrings("java", "selenium"));

	}
	 
		  public static String mergeStrings(String one, String two) {
			  String merge = "";
		    for(int i=0;i<one.length()+two.length();i++){
		     
		    	 merge+=one.substring(i,i+1).concat(two.substring(i,i+1));
		     }
		    
		      return merge;
		  
		}
}
