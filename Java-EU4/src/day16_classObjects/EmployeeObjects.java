package day16_classObjects;

public class EmployeeObjects {

	public static void main(String[] args) {

		Employee empl=new Employee();
		System.out.println(empl.name);
		
		empl.name="Roksana";
		empl.jobTitle="Supervisor";
		empl.salary=5000;
		
		System.out.println(empl.name);
		System.out.println(empl.jobTitle);
		System.out.println(empl.salary);
		
		empl.attendMeeting();
		empl.work();
		empl.introduce();
		

	}

}
