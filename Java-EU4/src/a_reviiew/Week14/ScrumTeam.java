package a_reviiew.Week14;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

	public String BA, PO, SM;
	ArrayList <Tester> testers;
	ArrayList <Developer>developers;
	
	public ScrumTeam(String BA, String PO, String SM) {
		this.BA=BA;
		this.PO=PO;
		this.SM=SM;
		testers=new ArrayList<>();
		developers=new ArrayList<>();
	}
	
	public void hireTester(Tester tester) {
		testers.add(tester);
	}
	public void hireTester(Tester[] testers) {
		//this.testers.addAll( Arrays.asList(testers));
		for(Tester eachTester : testers)  hireTester(eachTester);
	}
	
	public void hireDeveloper(Developer developer) {
		developers.add(developer);
	}
	
	public void hireDeveloper(Developer[] developers) {
		this.developers.addAll( Arrays.asList(developers));
	}
	
	public void termiinateTester(String ID) {
		//testers.removeIf( p -> p.ID.equals(ID) );
		
		Tester tester=null;
		for(Tester each : testers) {
			if(each.ID.equals(ID)) {
				tester=each;
			}
		}
		testers.remove(tester);
	}
	
	public void terminateDeveloper(String ID) {
		
		Developer developer=null;
		for(Developer each : developers) {
			if(each.ID.equals(ID)) {
				developer=each;
			}
		}
		
		developers.remove(developer);
		
	}

	@Override
	public String toString() {
		return "ScrumTeam [BA=" + BA + ", PO=" + PO + ", SM=" + SM + ", testers=" + testers.size() +
				", developers="+ developers.size() + "]";
	}
	
	public void dailyStandUp() {
		System.out.println(SM+" is doing daily stand up meeting");
	}
	
	
	
}
