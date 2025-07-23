package ArraysObject;

public class Employee {
	
	String name;
	int emid;
	int deptNo;
	int managerNo;
	String hireDate;
	double sal;
	double commi;
	String job;
	
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int emid, int deptNo, int managerNo, String hireDate,
			double sal, double commi, String job) {
		super();
		this.name = name;
		this.emid = emid;
		this.deptNo = deptNo;
		this.managerNo = managerNo;
		this.hireDate = hireDate;
		this.sal = sal;
		this.commi = commi;
		this.job = job;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", emid=" + emid + ", deptNo=" + deptNo + ", managerNo=" + managerNo
				+ ", hireDate=" + hireDate + ", sal=" + sal + ", commi=" + commi + ", job=" + job + "]";
	}
}
