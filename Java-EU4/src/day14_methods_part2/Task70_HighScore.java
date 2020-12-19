package day14_methods_part2;

public class Task70_HighScore {
	
	/*Create a method called displayHighScorePosition. 
	 * It should have a players name as a parameter, 
	 * and a 2ndparameter as a position in the high score table. 
	 * You should display the players name along with a message
	 *  like  “managed to get into position” and the position 
	 *  they got and a further message “on the high score table”
	 *  §
	 *  Create a 2ndmethod called calculateHighScorePosition. 
	 *  It should be sent one argument only., the player score. 
	 *  It should return an int.
	 *   The return data should be :1 –if the score is >=10002 
	 *   –if the core is >=500 and <10003-if the score is >=100 
	 *   and <5004-in all other cases§Call both methods and display 
	 *   the results of the following: a score of 1500, 900, 400 and 50
	 */

	public static void main(String[] args) {
		
		//int x= calculateHighScorePosition(1000);
		 
		
		displayHighScorePosition("Jose", calculateHighScorePosition(1000));
		 
		
	}
	
	public static void displayHighScorePosition(String name,int position) {
		System.out.println(name+" managed to get position "+position+" on the high score position");

	}
	
	public static int calculateHighScorePosition(int score) {
		
		  if(score>=1000) {
			return 1;
		}else if(score >=500 && score<1000) {
			return 2;
		}else if (score >=100 && score<500) {
			return 3;
		}else 
			return 4;
		 
	}
}
