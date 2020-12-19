package a_reviiew.Week2;

public class DivisionAndReminderPractice {

	public static void main(String[] args) {
		
		int second=3910;
		int minute,hours;
		
		
		
		// hours=minute/60;
		hours=second/3600;
		System.out.println("The hour is :"+hours);
		
		minute=second%3600/60;
		
		System.out.println("The ramaining minute is : "+minute);
		
	
		
		int remainingSecondAfterMinute=second%3600%60;
		
		System.out.println("The remaining second is ; "+remainingSecondAfterMinute);
		
		
	}

}
