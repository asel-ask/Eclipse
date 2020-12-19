package repl_it_part2;

public class N_180_MethodsWithReturn {

	public static void main(String[] args) {

 
	System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  String adjust="";
	       if(main.contains(coverME)){
	        adjust=main.replace(coverME,"["+coverME+"]");
	      }else 
	    	  adjust=("[").concat(main).concat("]");
	     
	     return adjust;
	   
	  }
	  
	
		}
		
	
