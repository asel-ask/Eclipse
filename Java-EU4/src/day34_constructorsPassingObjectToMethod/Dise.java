package day34_constructorsPassingObjectToMethod;

import java.util.Random;

public class Dise {

	int sides;
	int value;
	
	public Dise(int numSides) {
		sides=numSides;
		roll();
	}
	
	public void roll() {
		Random rand=new Random();
		value=rand.nextInt(sides)+1;
	}
	public int getSides() {
		return sides;
	}
	public int getValue() {
		return value;
	}
}
