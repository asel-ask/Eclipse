package day44_oop_review.call_center;

public class CallCenter {

	public static void main(String[] args) {
	
		WhatsApp wa=new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank You");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(2);
		
		System.out.println("--------------------");
		
		VoiceCallable obj=new WhatsApp();
		obj=new WhatsApp2();
		
	   ((MessagingApp)obj).launch();
	   ((VideoCallable)obj).videoCall();
	   ((MessagingApp)obj).allOSCompatible=false;	
	   
	   
	   
	   
	   
	   
		
				
	}

}
