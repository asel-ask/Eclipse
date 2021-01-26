package day48_collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {
		
		List<Map<String, String>>employees=new ArrayList<>();
		Map<String,String>emplData=new HashMap<>();
		emplData.put("EmpID", "123");
		emplData.put("EmpName", "John");
		emplData.put("JobTitle", "SDET");
		emplData.put("Salary", "100000");
		
		Map<String,String>emplData2=new HashMap<>();
		emplData2.put("EmpID", "124");
		emplData2.put("EmpName", "Mike");
		emplData2.put("JobTitle", "Dev");
		emplData2.put("Salary", "80000");
		
		employees.add(emplData);
		employees.add(emplData2);
		
		System.out.println(employees.toString());
		System.out.println(employees.size());
		
		System.out.println(employees.get(0));
		
		System.out.println(employees.get(1).get("EmpName"));
		
		for(Map<String, String> emp : employees ) {
			System.out.println(emp.get("JobTitle"));
		}
		int totalSalary=0;
		for(Map<String, String> emp : employees ) {
			totalSalary += Integer.parseInt(emp.get("Salary"));
		}
		System.out.println("Total salary: "+totalSalary);
	}
}
