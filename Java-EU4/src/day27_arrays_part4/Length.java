package day27_arrays_part4;

public class Length {

	public static void main(String[] args) {

		int[][] numbers= {
				{1,2,3,4},				//row1
				{5,6},					//row2
				{9,10,11,23,30,50,60}	//row3
		};
		
		//display number of rows
		System.out.println(numbers.length);
		
		//display number of column
		for(int i=0; i<numbers.length;i++) {
			System.out.println("The number of columns in row "+i+" is "+numbers[i].length);
		}
		
//		System.out.println(numbers[0].length);
//		System.out.println(numbers[1].length);
//		System.out.println(numbers[2].length);
		System.out.println("-------------------");
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" "); //row column
			}System.out.println();
		}

	}

}
