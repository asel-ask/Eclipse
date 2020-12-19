package a_reviiew.Week14;

import java.util.Arrays;

public class AppleInc {

	public static void main(String[] args) {
		
		        Tester tester1 = new Tester("Ali", 28, 'M', 55, "QA", "A01", true);
		        Tester tester2 = new Tester("Joseph", 28, 'M', 50, "SDET", "A02", true);
		        Tester tester3 = new Tester("Serkan", 28, 'M', 52, "QA", "A03", true);

		        Tester[] testers = {tester2, tester3};

		        Developer developer1 = new Developer("Eren", 29, 'F', 65, "Java Developer", "B01", true);
		        Developer developer2 = new Developer("Zeynep", 29, 'F', 66, "Software Developer", "B02", true);
		        Developer developer3 = new Developer("Safiye", 29, 'F', 67, "Java Developer", "B03", true);
		        Developer developer4 = new Developer("Nurullah", 29, 'M', 68, "Junior Developer", "B04", true);

		        Developer[] developers = {developer2, developer3, developer4};

		        ScrumTeam scrum1 = new ScrumTeam("Yakup", "Ilyas", "Baky");
		        scrum1.hireTester(tester1);
		        scrum1.hireDeveloper(developer1);

		        scrum1.hireTester(testers);
		        scrum1.hireDeveloper(developers);
		        System.out.println(scrum1);

		        System.out.println("===================================================");
		        double budget=0;
		        // display the developers of the scrum team:
		          for(Developer each : scrum1.developers) {
		        	  System.out.println(each.name+" : "+each.calculateSalary());
		        	  budget += each.calculateSalary();
		          }
		          	
		       System.out.println("===================================================");
			     // display the developers of the scrum team:
		       
		       for(Tester each : scrum1.testers) {
		    	   System.out.println(each.name+" : "+each.calculateSalary());
		    	   budget += each.calculateSalary();
		       }

		       System.out.println("===================================================");
		       System.out.println("budget = "+ budget);
		       
		       System.out.println("===================================================");
		       ScrumTeam scrum2= new ScrumTeam("Yakup", "Ilyas", "Baky");
		       ScrumTeam scrum3 = new ScrumTeam("Yakup", "Ilyas", "Baky");
		       
		       ScrumTeam[]scrums= {scrum1,scrum2,scrum3};
		       
		       for(ScrumTeam eachScrum : scrums){
		            System.out.println(eachScrum);
		        }


		        System.out.println(Arrays.toString(scrums));


		        System.out.println("========================================================");
		        scrum1.termiinateTester("A01");
		        scrum1.terminateDeveloper("B04");
		        System.out.println(scrum1);

	}
}
