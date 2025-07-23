package ArraysObject;

import java.util.Iterator;

public class EmployeeDB {
	
	private String user;
	private String pass;
	private boolean connect;
	private Employee [] db = new Employee[10];
	private int count = 0;
	private int index = 0;
	
	private EmployeeDB() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDB(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		System.out.println("DB created!");
	}
	
	public void login(String user,String pass)
	{
		if (this.user.equals(user) && this.pass.equals(pass)) {
			connect = true;
			System.out.println("Database Connected!");
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public boolean addEmployee(String name, int emid, int deptNo, int managerNo, String hireDate,
			double sal, double commi, String job)
	{
		if (connect && count<0.75*db.length) {
			db[index] = new Employee(name,  emid, deptNo, managerNo, hireDate, sal, commi, job);
			count++;
			index++;
			//System.out.println(name+ "Employee Added!");
			return true;
		}
		else if (connect) {
			Employee [] temp = new Employee[db.length*2];
			for (int i = 0; i < db.length; i++) {
				temp[i] = db[i];
			}
			db = temp;
			db[index] = new Employee(name,  emid, deptNo, managerNo, hireDate, sal, commi, job);
			count++;
			index++;
			//System.out.println(name+ "Employee Added!");
			return true;
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
			return false;
		}
	}
	
	public void showDB()
	{
		if (connect) {
			for (int i = 0; i < count; i++) {
				System.out.println(db[i]);
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified"); 
		}
	}
	
	public void searchByJob(String job)
	{
		if (connect) {
			for (int i = 0; i < count; i++) {
				if (db[i].job.equalsIgnoreCase(job)) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchByDeptNo(int deptno)
	{
		if (connect) {
			for (int i = 0; i < count; i++) {
				if (db[i].deptNo==deptno) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void salaryEquals(double salr)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].sal==salr) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}
	}
	
	public void salaryLessThan(double salr)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].sal<salr) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}

	}
	
	public void salaryGreaterThan(double salr)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].sal>salr) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}
	}
	
	public void commisionEquals(double comm)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].commi==comm) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}
	}
	
	public void commisionLessThan(double comm)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].commi<comm) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}

	}
	
	public void commisionGreaterThan(double comm)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].commi>comm) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}
	}
	
	public void employeeWorkingUnderMgr(int mgrId)
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].managerNo==mgrId) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}
	}
	 
	public void dontHaveManager()
	{
		if (connect) {
			int cnt=0;
			for (int i = 0; i < count;i++ ) {
				if ( db[i].managerNo<0) {
					cnt++;
					System.out.println(db[i]);
				}
				else if(count-1==i && cnt==0) {
					System.out.println("not found");
				}
				
			}
		}
	}
	public void maxSalary()
	{
		if (connect) {
			double max = Double.MIN_VALUE; 
			for (int i = 0; i < count; i++) {
				if (db[i].sal > max) {
					max = db[i].sal;
					
				}
			}
		    for (int i = 0; i < count; i++) {
				if (max == db[i].sal) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void secondMaxSalary() {
		if (connect) {
			double max = Double.MIN_VALUE;
			double secMax = Double.MIN_VALUE;

			for (int i = 0; i < count; i++) {
				if (db[i].sal > max) {
					secMax = max;
					max = db[i].sal;
				} else if (db[i].sal > secMax && db[i].sal != max) {
					secMax = db[i].sal;
				}
			}

			for (int i = 0; i < count; i++) {
				if (db[i].sal == secMax) {
					System.out.println(db[i]);
				}
			}
		}
	}

	public void minSalary()
	{
		if (connect) {
			double min = Double.MAX_VALUE; 
			for (int i = 0; i < count; i++) {
				if (db[i].sal < min) {
					min = db[i].sal;	
				}
			}
		    for (int i = 0; i < count; i++) {
				if (min == db[i].sal) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void secondMinSalary() {
		if (connect) {
			double min = Double.MAX_VALUE;
			double secMin = Double.MAX_VALUE;
			for (int i = 0; i < count; i++) {
				if (db[i].sal < min) {
					secMin = min;
					min = db[i].sal;
				} else if (db[i].sal < secMin && db[i].sal != min) {
					secMin = db[i].sal;
				}
			}
			for (int i = 0; i < count; i++) {
				if (db[i].sal == secMin) {
					System.out.println(db[i]);
				}
			}
		}
	}

}
