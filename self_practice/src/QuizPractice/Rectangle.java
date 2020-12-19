package QuizPractice;

public class Rectangle {

	double length;
	double heigth;
	
	
	 Rectangle(double length, double heigth) {
		
		this.length = length;
		this.heigth = heigth;
	}

	 Rectangle(Rectangle rec) {
		
		length = rec.length;
		heigth = rec.heigth;
	}
	 
	 public String toString() {
		 System.out.println("Copy constructor called");
			return "("+length+" + "+heigth+"i)";
		}
		
	
	
	
	
}
