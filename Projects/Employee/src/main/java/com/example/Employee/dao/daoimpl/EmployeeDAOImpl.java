package com.example.Employee.dao.daoimpl;

import com.example.Employee.dao.EmployeeDAO;
import com.example.Employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private final EntityManager theManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager theManager)
    {
        this.theManager=theManager;
    }

    @Override
    @Transactional
    public void save(Employee theEmployee){
        theManager.persist(theEmployee);
    }

    @Override
    public Employee findById(int theId)
    {
        return theManager.find(Employee.class,theId);
    }

    @Override
    public Employee findByPhoneNo(long contactNo) {
        try {
            Query query = theManager.createQuery(
                    "select e from Employee e where e.contactInfo = :contactInfo");
            query.setParameter("contactInfo", contactNo);
            return (Employee) query.getSingleResult();
        } catch (NoResultException noe) {
            return null;
        }
    }

    @Override
    public Employee findByFirstName(String fname) {
        Query query = theManager.createQuery(
                "SELECT e FROM Employee e WHERE e.firstName = :firstName", Employee.class);
        query.setParameter("firstName", fname);
        return (Employee) query.getSingleResult();
    }

    @Override
    public List<Employee> findByLastName(String lname) {
        Query query = theManager.createQuery(
                "SELECT e FROM Employee e WHERE e.lastName = :lastName", Employee.class);
        query.setParameter("lastName", lname);
        return query.getResultList();
    }

    @Override
    public List<Employee> findBySalary(double salary) {
        Query query = theManager.createQuery(
                "SELECT e FROM Employee e WHERE e.salary = :salary", Employee.class);
        query.setParameter("salary", salary);
        return query.getResultList();
    }

    @Override
    public List<Employee> fetchAll() {
        Query query = theManager.createQuery("select e from Employee e") ;
        return  query.getResultList();
    }

    @Override
    public List<Employee> findByDesignation(String designation) {
        Query query = theManager.createQuery(
                "SELECT e FROM Employee e WHERE e.designation = :designation", Employee.class);
        query.setParameter("designation", designation);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateId(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee != null) {
            System.out.print("Enter New Employee ID : ");
            int newId = sc.nextInt();

            theManager.detach(foundEmployee); // detach old object
            foundEmployee.setId(newId);       // set new ID
            theManager.merge(foundEmployee);  // re-attach with new ID

            System.out.println("Employee ID Updated Successfully!");
        } else {
            System.out.println("No such Employee Exist To Update");
        }
    }

    @Override
    @Transactional
    public void updateFirstName(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee != null) {
            System.out.print("Enter The Employee New First Name : ");
            foundEmployee.setFirstName(sc.nextLine());
            System.out.println("First Name Updated Successfully!");
        } else {
            System.out.println("No such Employee Exist To Update");
        }
    }

    @Override
    @Transactional
    public void updateLastName(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee != null) {
            System.out.print("Enter The Employee New Last Name : ");
            foundEmployee.setLastName(sc.nextLine());
            System.out.println("Last Name Updated Successfully!");
        } else {
            System.out.println("No such Employee Exist To Update");
        }
    }

    @Override
    @Transactional
    public void updateContact(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee != null) {
            System.out.print("Enter The Employee New Contact Number : ");
            foundEmployee.setContactInfo(sc.nextLong());
            System.out.println("Contact Number Updated Successfully!");
        } else {
            System.out.println("No such Employee Exist To Update");
        }
    }

    @Override
    @Transactional
    public void updateDesignation(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee != null) {
            System.out.print("Enter The Employee New Designation : ");
            foundEmployee.setDesignation(sc.nextLine());
            System.out.println("Designation Updated Successfully!");
        } else {
            System.out.println("No such Employee Exist To Update");
        }
    }

    @Override
    @Transactional
    public void updateSalary(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee foundEmployee = theManager.find(Employee.class,theId);

        if (foundEmployee!=null)
        {
            System.out.println("Enter The Employee New Salary : ");
            foundEmployee.setSalary(sc.nextDouble());
            System.out.println("Salary Updated Successfully ! ");
        }
        else {
            System.out.println("No such Employee Exist To Update");
        }
    }

    @Override
    @Transactional
    public void remove(int theId) {
        Employee foundEmployee = theManager.find(Employee.class, theId);

        if (foundEmployee != null) {
            theManager.remove(foundEmployee);
            System.out.println("Employee Removed Successfully !");
        } else {
            System.out.println("No such Employee Exists To Delete");
        }
    }
}
