package ArraysObject;

public class EmployeeDBDriver {
	
	public static void main(String[] args) {
		
		EmployeeDB ref = new EmployeeDB("Scott", "Tiger");
		ref.login("Scott", "Tiger");
		ref.addEmployee("Smith", 7369, 20, 7902, "17/12/1980", 800.0, 0.0, "Clerk");
		ref.addEmployee("Allen", 7499, 30, 7698, "20/02/1981", 1600.0, 300.0, "Salesman");
		ref.addEmployee("Ward", 7521, 30, 7698, "22/02/1981", 1250.0, 500.0, "Salesman");
		ref.addEmployee("Jones", 7566, 20, 7839, "02/04/1981", 2975.0, 0.0, "Manager");
		ref.addEmployee("Martin", 7654, 30, 7698, "28/09/1981", 1250.0, 1400.0, "Salesman");
		ref.addEmployee("Blake", 7698, 30, 7839, "01/05/1981", 2850.0, 0.0, "Manager");
		ref.addEmployee("Clark", 7782, 10, 7839, "09/06/1981", 2450.0, 0.0, "Manager");
		ref.addEmployee("Scott", 7788, 20, 7566, "19/04/1987", 3000.0, 0.0, "Analyst");
		ref.addEmployee("King", 7839, 10, -1, "17/11/1981", 5000.0, 0.0, "President");
		ref.addEmployee("Turner", 7844, 30, 7698, "08/09/1981", 1500.0, 0.0, "Salesman");
		ref.addEmployee("Adams", 7876, 20, 7788, "23/05/1987", 1100.0, 0.0, "Clerk");
		ref.addEmployee("James", 7900, 30, 7698, "03/12/1981", 950.0, 0.0, "Clerk");
		ref.addEmployee("Ford", 7902, 20, 7566, "03/12/1981", 3000.0, 0.0, "Analyst");
		ref.addEmployee("Miller", 7934, 10, 7782, "23/01/1982", 1300.0, 0.0, "Clerk");
		//ref.showDB();
		//ref.searchByDeptNo(30);
		//ref.searchByJob("Salesman");
		//ref.salaryEquals(1300.0);
		//ref.salaryLessThan(1000);
		//ref.salaryGreaterThan(1000);
		//ref.commisionEquals(300);
		//ref.commisionLessThan(500.0);
		//ref.commisionGreaterThan(300);
		//ref.employeeWorkingUnderMgr(7698);
		//ref.dontHaveManager();
		//ref.maxSalary();
		//ref.secondMaxSalary();
		//ref.minSalary();
		//ref.secondMinSalary();
		
	}

}
