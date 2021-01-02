package assignments.assign_14.question5;

public class TVTest {

	public static void main(String[] args) {

		TV tv=new TV();
		System.out.println("brand : "+tv.getBrand());
		System.out.println("channel : "+tv.getChannel());
		System.out.println("volume level : "+tv.getVolumeLevel());	
		tv.setChannel(125);
		tv.setVolumeLevel(9);
		System.out.println(tv.isOn());
		tv.turnOff();
		tv.turnOn();
		System.out.println(tv.isOn());
		tv.setChannel(110);
		tv.setVolumeLevel(5);
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolumeLevel());
	}

}
