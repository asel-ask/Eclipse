package day37_inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person=new Person();
		Student student=new Student();
		
		person.name="Mike";
		person.age=35;
		person.gender='M';
		
		//fields inherited from person class
		student.name="Smith";
		student.age=23;
		student.gender='M';
		
		student.studentID=7070;
		
		person.eat("Steak");
		student.eat("Pizza");
		
	
		//person.code("JAVA");
		
	}

}
