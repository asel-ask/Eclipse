package assignments.assign_14.question6;

public class ParkingMeter {

	int timeLeft=0, maxTime ;

	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	public boolean add (int a) {
		if(a==25 && timeLeft < maxTime) {
			timeLeft += 30;
			return true;
		}
		return false;
	}
	public void tick () {
		if(timeLeft>0) {
			timeLeft--;
		}
	}
	public boolean  isExpired () {
		if(timeLeft==0) {
			return true;
		}
		return false;
	}
}
