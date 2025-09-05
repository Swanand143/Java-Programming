package com.example.Employee;

import com.example.Employee.dao.EmployeeDAO;
import com.example.Employee.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EmployeeApplication {
    @Bean
    public CommandLineRunner commandLineRunner(EmployeeDAO theEmployeeDAO) {
        return runner ->
        {
            Scanner sc = new Scanner(System.in);

            boolean mainRunning = true;

            while (mainRunning) {
                System.out.println("\n===== Employee Management Menu =====");
                System.out.println("1. Insert New Employee");
                System.out.println("2. Fetch By ID");
                System.out.println("3. Fetch By Contact Number");
                System.out.println("4. Fetch By First Name");
                System.out.println("5. Fetch By Last Name");
                System.out.println("6. Fetch By Salary");
                System.out.println("7. Fetch By Designation");
                System.out.println("8. Fetch All");
                System.out.println("9. Go To Update Menu");
                System.out.println("10. Exit Employee Management Menu");
                System.out.print("Enter Your Choice : ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee First Name : ");
                        String firstName = sc.nextLine();

                        System.out.print("Enter Employee Last Name : ");
                        String lastName = sc.nextLine();

                        System.out.print("Enter Employee Contact : ");
                        long phoneNo = sc.nextLong();
                        sc.nextLine();

                        System.out.print("Enter Employee Designation : ");
                        String desig = sc.nextLine();

                        System.out.print("Enter Employee Salary : ");
                        double salary = sc.nextDouble();

                        theEmployeeDAO.save(new Employee(firstName, lastName, phoneNo, desig, salary));
                        System.out.println("✅ Employee Saved Successfully");
                        break;

                    case 2:
                        System.out.println("Enter The Employee ID To Fetch : ");
                        Employee byId = theEmployeeDAO.findById(sc.nextInt());
                        if (byId != null) {
                            System.out.println(byId);
                            System.out.println("Employee Found !");
                        } else {
                            System.out.println("Employee Not Found !");
                        }
                        break;

                    case 3:
                        System.out.println("Enter The Employee Contact Number : ");
                        Employee byContact = theEmployeeDAO.findByPhoneNo(sc.nextLong());
                        if (byContact != null) {
                            System.out.println(byContact);
                            System.out.println("Employee Contact Found !");
                        } else {
                            System.out.println("Employee Contact Not Found !");
                        }
                        break;

                    case 4:
                        System.out.println("Enter The Employee First Name : ");
                        Employee byFname = theEmployeeDAO.findByFirstName(sc.nextLine());
                        if (byFname != null) {
                            System.out.println(byFname);
                            System.out.println("Employee Found !");
                        } else {
                            System.out.println("Employee Not Found !");
                        }
                        break;

                    case 5:
                        System.out.println("Enter The Employee Last Name : ");
                        List<Employee> byLname = theEmployeeDAO.findByLastName(sc.nextLine());

                        if (!byLname.isEmpty()) {
                            for (Employee emp : byLname) {
                                System.out.println(emp);
                            }
                            System.out.println("Employee Found !");
                        } else {
                            System.out.println("Employee Not Found !");
                        }
                        break;

                    case 6:
                        System.out.print("Enter Employee Salary : ");
                        double sal = sc.nextDouble();
                        sc.nextLine();

                        List<Employee> bySalary = theEmployeeDAO.findBySalary(sal);

                        if (!bySalary.isEmpty()) {
                            for (Employee emp : bySalary) {
                                System.out.println(emp);
                            }
                            System.out.println("Employee Found !");
                        } else {
                            System.out.println("Employee Not Found !");
                        }
                        break;

                    case 7:
                        System.out.print("Enter Employee Designation : ");
                        String designation = sc.nextLine();

                        List<Employee> byDesignation = theEmployeeDAO.findByDesignation(designation);

                        if (!byDesignation.isEmpty()) {
                            for (Employee emp : byDesignation) {
                                System.out.println(emp);
                            }
                            System.out.println("Employee Found !");
                        } else {
                            System.out.println("Employee Not Found !");
                        }
                        break;

                    case 8:
                        List<Employee> employees = theEmployeeDAO.fetchAll();
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                        break;

                    case 9: // Go to Update Menu
                        boolean updateRunning = true;
                        while (updateRunning) {
                            System.out.println("\n===== Update Menu =====");
                            System.out.println("1. Update Employee ID");
                            System.out.println("2. Update First Name");
                            System.out.println("3. Update Last Name");
                            System.out.println("4. Update Contact Number");
                            System.out.println("5. Update Designation");
                            System.out.println("6. Update Salary");
                            System.out.println("7. Delete Employee");
                            System.out.println("8. Exit Update Menu");
                            System.out.println("9. Return to Main Menu");
                            System.out.print("Enter Your Choice: ");

                            int updateChoice = sc.nextInt();
                            sc.nextLine();

                            switch (updateChoice) {
                                case 1:
                                    System.out.println("Enter Current Employee ID : ");
                                    int oldId = sc.nextInt();
                                    theEmployeeDAO.updateId(oldId);
                                    break;

                                case 2:
                                    System.out.println("Enter Employee ID To Update First Name : ");
                                    theEmployeeDAO.updateFirstName(sc.nextInt());
                                    break;

                                case 3:
                                    System.out.println("Enter Employee ID To Update Last Name : ");
                                    theEmployeeDAO.updateLastName(sc.nextInt());
                                    break;

                                case 4:
                                    System.out.println("Enter Employee ID To Update Contact Number : ");
                                    theEmployeeDAO.updateContact(sc.nextInt());
                                    break;

                                case 5:
                                    System.out.println("Enter Employee ID To Update Designation : ");
                                    theEmployeeDAO.updateDesignation(sc.nextInt());
                                    break;

                                case 6:
                                    System.out.println("Enter Employee ID To Update Salary : ");
                                    theEmployeeDAO.updateSalary(sc.nextInt());
                                    break;

                                case 7:
                                    System.out.println("Enter The Employee ID TO Delete : ");
                                    theEmployeeDAO.remove(sc.nextInt());
                                    break;

                                case 8:
                                    updateRunning = false;
                                    System.out.println("Exiting Update Menu...");
                                    break;

                                case 9:
                                    System.out.println("Returning to Main Menu...");
                                    updateRunning = false;
                                    break;

                                default:
                                    System.out.println("Invalid Choice!");
                            }
                        }
                        break;

                    case 10:
                        mainRunning = false;
                        System.out.println("Exiting Employee Management Menu... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        };
    }


    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(EmployeeApplication.class, args);
    }

}
