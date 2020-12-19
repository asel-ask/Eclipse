package day35_encapsulation;

public class Person {

	private String name;
	private int age;
	private char gender;
	
	
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	 
				// getter ---> get + variable name 
	public String getName() {
		return name;
	}			//setter ---> set + variable name
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//condition
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
				

	
}

      //public,private    ---> Encapsulation
	  //protected,default