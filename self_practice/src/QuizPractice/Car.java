package QuizPractice;

public class Car {

	private String title;
	String [] array= {"a","an","the","and","but","for","nor","or","so","yet","at","by",
			"in","into","near","of","on","to","than","via"};
	
	 public void setTitle(String title) {
	    	if(title.contains(" ")) {
	    		String [] arr=title.split(" ");
	    		arr[0].toUpperCase();
	    		for(int i=1;i<arr.length;i++) {
	    			if(arr[i].equals(array)) {
	    				arr[i].toLowerCase();
	    			}else {
	    				arr[i].toUpperCase();
	    			}
	    		}
	    		
	    	}else {
	    		this.title=title;
	    	}
	    		
	    	if(title.isEmpty()) {
	    		this.title="";
	    	}

	    }
	
	public static void main(String[] args) {
	
	}

}
