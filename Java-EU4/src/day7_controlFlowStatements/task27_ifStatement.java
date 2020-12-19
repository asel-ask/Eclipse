package day7_controlFlowStatements;

public class task27_ifStatement {

	public static void main(String[] args) {
		
		double hour=23.15;
		if(hour < 12) {
			System.out.println("Good Morning");
		}
		if(hour>=12&&hour<15) {
			System.out.println("Good Afternoon");
		}
		if(hour>=15&&hour<=21) {
			System.out.println("Good Evening");
		}
		if(hour>=21&&hour<=24) {
			System.out.println("Good Night");
		}
	}

}
