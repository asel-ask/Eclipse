package assignments.assign_14.question7;

public class GasTank {

	double amount =0,capacity;

	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas (double amount) {
		this.amount += amount;
		if(amount>capacity) {
			this.amount=capacity;
			}
	}
	public void useGas (double amount) {
		this.amount -= amount;
		if(amount<0) {
			this.amount=0;
		}
	}
	
	public boolean isEmpty () {
		if(amount<0.1) {
			return true;
		}
		return false;
	}
	public boolean isFull () {
		if(amount+0.01>capacity) {
			return true;
		}
		return false;
	}
	public double  getGasLevel () {
		return amount;
	}
	public void fillUp () {
		
	}
	
}
