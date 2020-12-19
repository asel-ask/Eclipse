package repl_it_part3;
import java.util.ArrayList;
public class N_198_CombineArrayLists {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<>();
		a.add("mango"); a.add("apple"); a.add("banana");
		
		ArrayList<String>b=new ArrayList<>();
		b.add("onion"); b.add("carrot"); b.add("squash");
		System.out.println(combineAll(a, b));

	}

		
		  public static ArrayList<String> combineAll(ArrayList<String>wordList1,ArrayList<String>wordList2){
			//create your method below
			ArrayList<String>combinedWords=new ArrayList<>();
			for(String value : wordList1){
			  combinedWords.add(value);
			}
			for(String value : wordList2){
			  combinedWords.add(value);
			}
			  return combinedWords;

		  }
		

	}


