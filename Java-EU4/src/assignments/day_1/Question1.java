package assignments.day_1;

public class Question1 {
	
	public static void main(String[] args) {
		
		System.out.println("\"I am ready to be Java pro:)\""); 
		double premium=50;
		int accidentsAmount=2;
    	double count3=0;
    	if(accidentsAmount>0) {
    		for(int i=0;i<=accidentsAmount;i++) {
    			count3=i*(premium*0.20);
    		}premium+=+count3;
    	}
    	System.out.println(premium);
	}

} 
