package assignments.day_3;

public class Question5 {

	public static void main(String[] args) {


		int hours,minutes,seconds,inputSeconds;
		
		inputSeconds=3695;
		hours= inputSeconds/3600;
		minutes=inputSeconds % 3600/60;
		seconds=inputSeconds % 3600 % 60;
		
		System.out.println("Input second is : "+inputSeconds);
		System.out.println(hours+" Hour, "+minutes+" Minutes, "+seconds+" Seconds");





	}

}
