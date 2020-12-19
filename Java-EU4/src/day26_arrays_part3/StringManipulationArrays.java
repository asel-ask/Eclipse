package day26_arrays_part3;

public class StringManipulationArrays {

	public static void main(String[] args) {
		
		String [] myCars= {"Honda","Mersedes","BMW","Toyota"," Ford "};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2,3));
		System.out.println(myCars[1].equals(myCars[2]));
		System.out.println(myCars[1] == (myCars[2]));
		System.out.println("----------------");
		
		for(int i=0;i<myCars.length;i++) {
			System.out.print(myCars[i].length()+" ");
		}
	}

}
