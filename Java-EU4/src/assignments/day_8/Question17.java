package assignments.day_8;

public class Question17 {

	public static void main(String[] args) {

		
		System.out.println(getThunderBluzz(false,false,1,2,5));
	
	}
	public static boolean getThunderBluzz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {
		
		if(available||gift) return true;
		else if(ingredient1==1&&ingredient2==2&&ingredient3==3)return true;
		else if(ingredient1==3&&ingredient2==1&&ingredient3==2)return true;
		else return false;
	}
}






