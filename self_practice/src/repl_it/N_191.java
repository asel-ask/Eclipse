package repl_it;

public class N_191 {

	public static void main(String[] args) {
		
			System.out.println(reverse("computer"));
			String word="a,b$c";
			String s="";
			for(int i=word.length()-1;i>=0;i--){
				for(char c='a';c<'z';c++) {
				if(word.charAt(i)==c) {
					s+=word.charAt(i);
					 
				}
				}
			}  System.out.println(s);
	}
	
	public static String reverse(String input)
	{
	  String s="";
	  for (int i=input.length()-1;i>=0;i--){
	    s += input.charAt(i);
	  }
	  return s;
	}
}
