package day19_stringManipulation_1;

public class Task77_Emoji {

	public static void main(String[] args) {


		String emoji=":)";
		char start=emoji.charAt(0);
		char end=emoji.charAt(1);
		if(emoji.length()==2) {
			if(start==':') {
				if(end==')') {
					System.out.println("Smile");
					}else if (end=='(')  {
						System.out.println("Sad");
					}else if(end=='/') {
						System.out.println("Upset");
					}else if(end=='p') {
						System.out.println("Playful");
					}else 
						System.out.println("Invalid emoji");
				}else if(start==';') {
					if(end==')') {
						System.out.println("Wink");
					}else if(end=='0') {
						System.out.println("Surprised");
					}else 
						System.out.println("invalid emoji");
				}else 
					System.out.println("Invalid emoji");
			
		}else 
			System.out.println("Invalid emoji");
		
//		if(emoji.length()!=2) {
//			System.out.println("Invalid emoji");
//			return;
//		}
//		
//		if(start==':') {
//			if(end==')') {
//				System.out.println("Smile");
//				}else if (end=='(')  {
//					System.out.println("Sad");
//				}else if(end=='/') {
//					System.out.println("Upset");
//				}else if(end=='p') {
//					System.out.println("Playful");
//				}else 
//					System.out.println("Invalid emoji");
//			}else if(start==';') {
//				if(end==')') {
//					System.out.println("Wink");
//				}else if(end=='0') {
//					System.out.println("Surprised");
//				}else 
//					System.out.println("invalid emoji");
//			}

	}

}
