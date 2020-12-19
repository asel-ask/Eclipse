package repl_it;

public class N_91_letterCombination {

	public static void main(String[] args) {
		

		
			for(char c='z';c>='v';c--) {
				for(char cr='z';cr>=c;cr--) {
					System.out.print(""+c+cr);
				}System.out.println();
			
			}
			//zz char+char
			//zy char-1
			//zx char-2
			//zv char-3
			//yz char-1+char
			//yy
			//yx
			
	}

}
