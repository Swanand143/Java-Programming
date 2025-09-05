package com.example.Employee.dao;

import com.example.Employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public void save (Employee theEmployee);

    public Employee findById(int theId);

    public Employee findByPhoneNo(long contactNo);

    public Employee findByFirstName(String fname);

    public List<Employee> findByLastName(String lname);

    public List<Employee> findBySalary(double salary);

    public List<Employee> findByDesignation(String designation);

    public List<Employee> fetchAll();

    public void updateSalary (int theId);

    public void updateId(int theId);

    public void updateFirstName(int theId);

    public void updateLastName(int theId);

    public void updateContact(int theId);

    public void updateDesignation(int theId);

    public void remove(int theId);

}
