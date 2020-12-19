package repl_it;

public class MethodsWStrings_184 {

	public static void main(String[] args) {
		
		System.out.println(at3("blabla", "a"));
	}
	
		  public static String at3(String target,String word)
		  {
		   
		  return target.substring(0,target.length()/2).concat(word).concat(target.substring(target.length()/2));
	
		  } 
	}

