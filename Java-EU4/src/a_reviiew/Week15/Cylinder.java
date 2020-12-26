package a_reviiew.Week15;

import java.text.DecimalFormat;

public class Cylinder extends Shape implements hasVolume{
	
	double radius;
	double heght;
	double volume;
	
	public Cylinder(double radius, double heght) {
		this.radius=radius;
		this.heght=heght;
		area=calculateArea();
		perimeter=calculatePerimeter();
		volume=calculateVolume();
		
	}
	static {
		name="Cylinder";
	}

	@Override
	public double calculateArea() {
		return (2*Math.PI*radius*heght)+(2*Math.PI*Math.pow(radius, 2));
	}

	@Override
	public double calculatePerimeter() {
		return (2*Math.PI*heght)+(4*Math.PI*Math.pow(radius, 2));
	}

	@Override
	public double calculateVolume() {
		return Math.pow(radius, 2)*heght*Math.PI;
	}

	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("0.00");
		return "Cylinder [radius=" + radius + ", heght=" + df.format(heght) + ", volume=" + df.format(volume) + "]";
	}

	
}
