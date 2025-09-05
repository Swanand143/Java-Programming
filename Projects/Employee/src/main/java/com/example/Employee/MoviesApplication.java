package com.example.Employee;

import com.example.Employee.dao.EmployeeDAO;
import com.example.Employee.dao.MoviesDAO;
import com.example.Employee.entity.Employee;
import com.example.Employee.entity.Movies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

//@SpringBootApplication
//public class MoviesApplication {
//
//    @Bean
//    //public CommandLineRunner moviescommandLineRunner(MoviesDAO theMoviesDAO) {
//        //return runner ->
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter The Movie Name : ");
//            String movieName=sc.nextLine();
//
//            System.out.print("Enter The Release Date : ");
//            String releaseDate=sc.nextLine();
//
//            System.out.print("Enter The Duration : ");
//            String duration=sc.nextLine();
//
//            System.out.print("Enter The Language : ");
//            String lang=sc.nextLine();
//
//            System.out.print("Enter The Rating : ");
//            double rating = sc.nextDouble();
//
//            theMoviesDAO.save(new Movies(movieName,releaseDate,duration,lang,rating));
//            System.out.println("Movie Saved Successfully");
//        };
//
//    }
//    public static void main(String[] args) {
//        SpringApplication.run(MoviesApplication.class, args);
//    }
//
//}
