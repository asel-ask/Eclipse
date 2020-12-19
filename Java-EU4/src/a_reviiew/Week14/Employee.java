package a_reviiew.Week14;

public class Employee extends Person {

	
	public double hourlyRate;
	public String jobTitle, ID;
	public boolean isFullTime;
	
	public Employee(String name, int age, char gender,double hourlyRate,
			String jobTitle, String ID,boolean isFullTime) {
		super(name, age, gender);
		this.hourlyRate=hourlyRate;
		this.jobTitle=jobTitle;
		this.ID=ID;
		this.isFullTime=isFullTime;
	}
	
	public void work() {
		System.out.println(jobTitle+" "+name+" is working");
	}
	
	public double calculateSalary() {
		return 52*40*hourlyRate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender+ ", "
				+ "hourlyRate= $" + hourlyRate + ", jobTitle=" + jobTitle + ", ID=" + ID + ", isFullTime="
				+ isFullTime + ", Annual Salary= $"+calculateSalary()+ "]";
	}
	
	
}
