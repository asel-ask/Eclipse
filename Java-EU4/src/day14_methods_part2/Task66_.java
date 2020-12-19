package day14_methods_part2;

public class Task66_ {

	public static void main(String [] args) {
		
		System.out.println(distanceCalculator(40, 35));
		int x =distanceCalculator(40, 5);
		System.out.println(x);
	}
	
	public static int distanceCalculator(int speed,int time) {
		int distance=speed*time;
		return distance;
	}
	
	
}

