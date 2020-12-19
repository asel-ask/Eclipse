package repl_it_part2;
import java.util.*;
public class N_171_2DArraysChessBoard {

	public static void main(String[] args) {

		 
		 
		    String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		    for(int row=0;row<chessBoard.length-1;row++){
		    	
		    		for(char a='a';a<='h';a++) {
			    int cols=a-97;
		    	chessBoard[row][cols]=row+1+""+a;
		    	
		    }
		   }
		    //DO NOT CHANGE
		   System.out.println(Arrays.deepToString(chessBoard));
		  
    
	
	}
		
}
