package assignments.day_9;

public class Q11 {

	public static void main(String[] args) {
		
		String str="Sender:<Mike Smith>. From Number:[202-123-3456]. "
				+ "Message:{I love programming and problem solving}";
		retrieve(str);
		
	}
	
		public static void retrieve(String msg) {
			
			String sender=msg.substring(msg.indexOf("<")+1,msg.indexOf(">"));
			String phone=msg.substring(msg.indexOf("[")+1,msg.indexOf("]"));
			String message=msg.substring(msg.indexOf("{")+1,msg.indexOf("}"));
			System.out.println("Sender: "+sender);
			System.out.println("Phone Number: "+phone);
			System.out.println("Message body: "+message);
		}
}
