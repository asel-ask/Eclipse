package day15_methodsOverload_part2;

public class Task71 {

	public static void main(String[] args) {

		 calcFeetAndInchesToCentimeters(100);

		 calcFeetAndInchesToCentimeters(6, 5);

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		if(feet>=0 && inches>=0 && inches<=12) {
			double cm=(feet*12)*2.54+(inches*2.54);
			System.out.println(feet+" feet, "+inches+" inches = "+cm+" centimeter");
			return cm;
		}else {
			System.out.println("Invalid feet or inches");
			return -1;
			 
		}
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches>=0) {
			double howManyFeet=(int)inches/12;
			double remaining=inches%12;
			
			System.out.println(inches+" inches = "+howManyFeet+" feet and "+remaining+" inches");
			return calcFeetAndInchesToCentimeters(howManyFeet, remaining);
		}else 
			return -1;
	}
	

}
