package a_reviiew.Week7;

public class ExtractMonth {

	public static void main(String[] args) {
		
		System.out.println(extractMonth("04/05/2020"));

	}
	public static String extractMonth(String date) {
		
		String month=date.substring(0,date.indexOf("/"));
		String day=date.substring(date.indexOf("/")+1,date.lastIndexOf("/"));
		String fixedDate="";
		
		switch(month) {
		
		case "01":
			fixedDate="January ";
			break;
		case "02":
			fixedDate="February " ;
			break;
		case "03":
			fixedDate="March ";
			break;
		case "04":
			fixedDate="April ";
			break;
		case "05":
			fixedDate="May ";
			break;
		case "06":
			fixedDate="June ";
			break;
		case "07":
			fixedDate="July ";
			break;
		case "08":
			fixedDate="August ";
			break;
		case "09":
			fixedDate="September ";
			break;
		case "10":
			fixedDate="October";
			break;
		case "11":
			fixedDate="November";
			break;
		case "12":
			fixedDate="December";
			break;
		}
		return fixedDate+day;
	}
}
