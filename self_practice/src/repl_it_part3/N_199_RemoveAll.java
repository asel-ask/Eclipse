package repl_it_part3;
import java.util.ArrayList;
public class N_199_RemoveAll {

	public static void main(String[] args) {
		
		ArrayList <String> value=new ArrayList<>();
		value.add("hi");value.add("hey"); value.add("hi"); value.add("yo");
		String targetWord="hi";
		removeAll(value,targetWord);
	}
	
		  public static void removeAll(ArrayList<String>wordList,String targetWord){
			//create your method below
		  for(int i=0;i<wordList.size();i++){
		    if(wordList.get(i).equals(targetWord)) {
		    	wordList.remove(i);
		    }
		    
		  }
		  System.out.println(wordList);
		  
		  
		  }
		

	}


