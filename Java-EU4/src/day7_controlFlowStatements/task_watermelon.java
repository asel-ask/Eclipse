package day7_controlFlowStatements;

public class task_watermelon {

	public static void main(String[] args) {
	
		int numberOfWatermelon=40;
		boolean lotsOfWatermelon=false;

		if(numberOfWatermelon>=20) {
			System.out.println("I have more than 20 watermelon");
			lotsOfWatermelon=true;
		}
		
		if(lotsOfWatermelon) {
			System.out.println("Good Job");
		}
		if(lotsOfWatermelon==false) {
			System.out.println("I need more watermelon");
		}else {
			System.out.println("I do not need more watermelon");
		}
	}

}
