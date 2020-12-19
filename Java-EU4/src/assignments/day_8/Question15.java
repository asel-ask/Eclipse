package assignments.day_8;

public class Question15 {

	public static void main(String[] args) {

		boolean b=validateTask(true, 3, 1);
		System.out.println(b);

	}

	public static boolean validateTask(boolean b,int taskId, int currentID) {
		
		if (!b){
		      return false;
		    }
		    if (b && taskId==currentID+1 && currentID==taskId-1){
		      return true;
		    }else 
		      return false;
		 
	}
	
}
