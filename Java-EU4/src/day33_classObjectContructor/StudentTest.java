package day33_classObjectContructor;

public class StudentTest {

	public static void main(String[] args) {

		Student s1=new Student("Mike", 17, 'M', 2016, "Java");
		Student s2=new Student("Smith", 18, 'M', 2015, "JS");
		
		
		s1.attendLab();
		s2.attendLecture();
		System.out.println(s1.university);

	}

}
