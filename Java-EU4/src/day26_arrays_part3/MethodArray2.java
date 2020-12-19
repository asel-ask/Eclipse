package day26_arrays_part3;
import java.util.Scanner;
public class MethodArray2 {

	public static void main(String[] args) {

		System.out.println(findCar(3, "Honda"));

	}
	public static String[] createArray(int carSize) {
		String[] cars=new String[carSize];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<carSize;i++) {
			System.out.println("Enter your car #"+(i+1));
			cars[i]=sc.next();
		}
		return cars;
	}
	public static boolean findCar(int num, String find) {
		 
		for(String value : createArray(num)) {
			if(value.equalsIgnoreCase(find)) {
				return true;
			}
		}
		return false;
	}
	
}
