package Encapsulation;

public class Student {
	private String institute = "Qspiders";
	private String name ;
	private String course ;
	private double fees ;
	private String branch ;
	private double cgpa ;
	private String degree ;
	private double sscPer ;
	private double hscPer ;
    private long phno ;
    
    public Student(String name, String course, double fees, String branch, double cgpa, String degree, double sscPer, double hscPer, long phno)
    {
    	this.name = name;
    	this.course =course;
    	this.fees = fees ;
    	this.branch = branch ;
    	this.cgpa = cgpa ;
    	this.degree = degree ;
    	this.sscPer = sscPer ;
    	this.hscPer = hscPer ;
    	this.phno = phno ; 
    	System.out.println("Student Registered");
    }
    
    public String getInstituteName()
    {
    	return institute ;
    }
    
    public String getName()
    {
    	return name ;
    }
    
    public String getCourse()
    {
    	return course ;
    }
    
    public double getFees()
    {
    	return fees;
    }
    
    public double getCgpa()
    {
    	return cgpa ;
    }
    
    public String getDegree()
    {
    	return degree ;
    }
    
    public double getSscPer()
    {
    	return sscPer ;
    }
    
    public double getHscPer()
    {
    	return hscPer ;
    }
    
    public long getPhno()
    {
    	return phno ;
    }
    
    public void setPhno(String name, long oldPhno, long newPhno)
    {
    	if (this.name==name && oldPhno==this.phno) {
			this.phno = newPhno ;
			System.out.println("Phone No Updated!");
		}
    	else {
    		System.out.println("Invalid Details");
    	}
    }

}
