package a_reviiew.Week14;

public final class Tester extends Employee {

	public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, String ID,
			boolean isFullTime) {
		super(name, age, gender, hourlyRate, jobTitle, ID, isFullTime);
		
	}
	
	public void findBug() {
		System.out.println(jobTitle+" "+name+" found bug");
	}
	
	public void testing() {
		System.out.println(jobTitle+" "+name+" is testing the application");
	}
	
	@Override
	public void work() {
		System.out.println(jobTitle+" "+name+" is automating the application");
	}
	
	
}
