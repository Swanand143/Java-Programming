package multidimensionalarray;

import java.util.Arrays;
import java.util.Iterator;

public class CommitRoleBack {
	
	String [] db = {"Smith","King","Raju","Scott","Turner"};
	String[][] savePoint = new String[10][];
	static int savePointIndex = 0;
	
	public boolean removeName(String name)
	{
		int i;
		for (i = 0;  i< db.length; i++) {
			if (db[i].equals(name)) {
				break;
			}
		}
		if (i<db.length) {
			String [] temp = new String[db.length-1];
			for (int j = 0; j < db.length; j++) {
				if (j<i) {
					temp[j] = db[j];
				}
				else if (j>i) {
					temp[j-1] = db[j];
				}
			}
			savePoint[savePointIndex] = db;
			savePointIndex++;
			db = temp;
			System.out.println(name+" removed!");
			return true;
		}
		return false;
	}
	
	public boolean addName(String name)
	{
		String[] temp = new String[db.length+1];
		for (int i = 0; i < db.length; i++) {
			temp[i] = db[i];
		}
		temp[db.length] = name;
		System.out.println(name+" added!");
		savePoint[savePointIndex] = db;
		savePointIndex++;
		db = temp;
		return true;
	}
	
	public boolean commit()
	{
		Arrays.fill(savePoint, null);
		savePointIndex = 0;
		return true;
	}
	
	public void roleBack(int steps)
	{
		if (steps>0 && steps<=10) {
			if (savePointIndex!=0) {
				db = savePoint[savePointIndex-steps];
			}
			else {
				System.out.println("No save points available");
			}
		}
		else {
			System.out.println("Invalid rolback count!");
		}
	}
	
	public void printDB()
	{
		System.out.println(Arrays.toString(db));
	}

}
