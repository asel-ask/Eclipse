package assignments.day_8;

public class Question16 {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(true,5,25,2018));

	}

	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

		 if(!isAvailable){
	      return false;
	    }
	    if( year!=2018){
	       return false;
	    }
	    if( month==7 && day>=1 && day<8){
	      return false;
	    }else 
	    return true;

		
	}

}
