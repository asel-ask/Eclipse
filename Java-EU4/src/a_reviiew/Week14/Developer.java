package a_reviiew.Week14;

public final class Developer extends Employee {

	public Developer(String name, int age, char gender, double hourlyRate, String jobTitle, String ID,
			boolean isFullTime) {
		super(name, age, gender, hourlyRate, jobTitle, ID, isFullTime);
	}
	
	public void coding() {
		System.out.println(jobTitle+" "+name+" is coding");
	}
	
	public void fixingBug() {
		System.out.println(jobTitle+" "+name+" is fixing occured bug");
		
	}
	
	@Override
	public void work() {
		System.out.println(jobTitle+" "+name+" is creating the application");
	}
	

}
