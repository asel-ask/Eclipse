package assignments.assign_14.question3;

public class DbTest {

	public static void main(String[] args) {

		Db db = new Db();
		db.insertData("first", 55);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		db.setData("zzz");
		db.setYint(200);

		System.out.println(db.getData());
		System.out.println(db.getYint());
	}

}
