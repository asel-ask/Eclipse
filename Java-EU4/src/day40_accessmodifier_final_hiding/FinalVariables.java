package day40_accessmodifier_final_hiding;

public class FinalVariables {

	public final int ROADSTER_MAX_RANGE=600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGER;
	public static final String ADMIN_USERNAME;
	
	public FinalVariables() {
		MODEL_3_MAXSPEED=200;
	}
	
	{
		MODEL_X_PASSENGER=7;
	}
	
	static {
		ADMIN_USERNAME="Mike";
	}
	
	public static void main(String[] args) {
	
		final int MAX_PASSENGERS_COUNT=5;
		final int SSN;
		SSN=66;
		
		FinalVariables finalVars=new FinalVariables();
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println(ADMIN_USERNAME);
	
	}
}
