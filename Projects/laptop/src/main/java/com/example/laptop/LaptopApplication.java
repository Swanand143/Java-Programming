package com.example.laptop;

import com.example.laptop.dao.LaptopDAO;
import com.example.laptop.entity.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class LaptopApplication {

    @Bean
    public CommandLineRunner commandLineRunner(LaptopDAO theLaptopDAO) {
        return runner -> {
            Scanner sc = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\n===== LAPTOP MANAGEMENT MENU =====");
                System.out.println("1. Add New Laptop");
                System.out.println("2. Fetch Laptop By ID");
                System.out.println("3. Fetch Laptop By IMIE No");
                System.out.println("4. Fetch Laptop By Brand");
                System.out.println("5. Fetch All Laptops");
                System.out.println("6. Update Laptop Details");
                System.out.println("7. Delete Laptop By ID");
                System.out.println("8. Exit");
                System.out.print("👉 Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // buffer clear

                switch (choice) {
                    case 1:
                        System.out.print("Enter The Laptop Brand : ");
                        String brand = sc.nextLine();

                        System.out.print("Enter The Laptop Model : ");
                        String model = sc.nextLine();

                        System.out.print("Enter The Laptop IMIE No : ");
                        long imie_no = sc.nextLong();

                        System.out.print("Enter The Laptop Ram : ");
                        int ram = sc.nextInt();

                        System.out.print("Enter The Laptop Memory : ");
                        int memory = sc.nextInt();

                        System.out.print("Enter The Laptop Generation : ");
                        int generation = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter The Laptop Processor : ");
                        String processor = sc.nextLine();

                        System.out.print("Enter The Laptop Price : ");
                        double price = sc.nextDouble();

                        theLaptopDAO.save(new Laptop(brand, model, imie_no, ram, memory, generation, processor, price));
                        System.out.println("✅ Laptop Saved Successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Laptop ID to Fetch: ");
                        Laptop l1 = theLaptopDAO.findById(sc.nextInt());
                        System.out.println(l1 != null ? l1 : "Laptop Not Found!");
                        break;

                    case 3:
                        System.out.print("Enter Laptop IMIE No: ");
                        Laptop l2 = theLaptopDAO.findByImieNo(sc.nextLong());
                        System.out.println(l2 != null ? l2 : "Laptop Not Found!");
                        break;

                    case 4:
                        System.out.print("Enter Laptop Brand: ");
                        String brandName = sc.nextLine();
                        List<Laptop> laptops = theLaptopDAO.findByBrand(brandName);
                        laptops.forEach(System.out::println);
                        break;

                    case 5:
                        List<Laptop> allLaptops = theLaptopDAO.fetchAll();
                        allLaptops.forEach(System.out::println);
                        break;

                    case 6:
                        System.out.print("Enter Laptop ID To Update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Choose what to update:");
                        System.out.println("1. Brand");
                        System.out.println("2. Model");
                        System.out.println("3. IMIE No");
                        System.out.println("4. RAM");
                        System.out.println("5. Memory");
                        System.out.println("6. Generation");
                        System.out.println("7. Processor");
                        System.out.println("8. Price");
                        System.out.print("👉 Enter Choice: ");

                        int updateChoice = sc.nextInt();
                        sc.nextLine();

                        switch (updateChoice) {
                            case 1:
                                theLaptopDAO.updateBrand(updateId);
                                break;

                            case 2:
                                theLaptopDAO.updateModel(updateId);
                                break;

                            case 3:
                                theLaptopDAO.updateImieNo(updateId);
                                break;

                            case 4:
                                theLaptopDAO.updateRam(updateId);
                                break;

                            case 5:
                                theLaptopDAO.updateMemory(updateId);
                                break;

                            case 6:
                                theLaptopDAO.updateGeneration(updateId);
                                break;

                            case 7:
                                theLaptopDAO.updateProcessor(updateId);
                                break;

                            case 8:
                                theLaptopDAO.updatePrice(updateId);
                                break;

                            default:
                                System.out.println("❌ Invalid Choice");
                        }
                        break;

                    case 7:
                        System.out.print("Enter Laptop ID To Delete: ");
                        theLaptopDAO.remove(sc.nextInt());
                        break;

                    case 8:
                        running = false;
                        System.out.println("👋 Exiting Laptop Management. Bye!");
                        break;

                    default:
                        System.out.println("❌ Invalid Choice. Try Again.");
                }
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(LaptopApplication.class, args);
    }
}
