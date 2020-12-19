package day34_constructorsPassingObjectToMethod;

public class Floor {

	double lenght;
	double width;
	
	public Floor(double lenght, double width) {
		
		if(lenght<0) {
			this.lenght=0;
		}else {
			this.lenght = lenght;
		}
		if(width<0) {
			this.width=0;
		}else {
			this.width = width;
		}
		
	}
	
	public double getArea () {
		return width*lenght;
		
	}
}
