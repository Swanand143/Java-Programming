package com.example.laptop.dao.daoimpl;

import com.example.laptop.dao.LaptopDAO;
import com.example.laptop.entity.Laptop;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class LaptopDAOImpl implements LaptopDAO {

    private final EntityManager theManager;

    @Autowired
    public LaptopDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    // ✅ Insert
    @Override
    @Transactional
    public void save(Laptop theLaptop) {
        theManager.persist(theLaptop);
    }

    // ✅ Fetch by ID
    @Override
    public Laptop findById(int theId) {
        return theManager.find(Laptop.class, theId);
    }

    // ✅ Fetch by IMIE Number
    @Override
    public Laptop findByImieNo(long imieNo) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.imie_no = :imie");
        query.setParameter("imie", imieNo);
        return (Laptop) query.getSingleResult();
    }

    // ✅ Fetch by Brand
    @Override
    public List<Laptop> findByBrand(String brand) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.brand = :brand");
        query.setParameter("brand", brand);
        return query.getResultList();
    }

    // ✅ Fetch by Model
    @Override
    public List<Laptop> findByModel(String model) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.model = :model");
        query.setParameter("model", model);
        return query.getResultList();
    }

    // ✅ Fetch by Processor
    @Override
    public List<Laptop> findByProcessor(String processor) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.processor = :processor");
        query.setParameter("processor", processor);
        return query.getResultList();
    }

    // ✅ Fetch by RAM
    @Override
    public List<Laptop> findByRam(int ram) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.ram = :ram");
        query.setParameter("ram", ram);
        return query.getResultList();
    }

    // ✅ Fetch by Memory
    @Override
    public List<Laptop> findByMemory(int memory) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.memory = :memory");
        query.setParameter("memory", memory);
        return query.getResultList();
    }

    // ✅ Fetch by Generation
    @Override
    public List<Laptop> findByGeneration(int generation) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.generation = :gen");
        query.setParameter("gen", generation);
        return query.getResultList();
    }

    // ✅ Fetch by Price
    @Override
    public List<Laptop> findByPrice(double price) {
        Query query = theManager.createQuery("SELECT l FROM Laptop l WHERE l.price = :price");
        query.setParameter("price", price);
        return query.getResultList();
    }

    // ✅ Fetch All
    @Override
    public List<Laptop> fetchAll() {
        Query query = theManager.createQuery("SELECT l FROM Laptop l");
        return query.getResultList();
    }

    // ✅ Update Brand
    @Override
    @Transactional
    public void updateBrand(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New Brand: ");
            laptop.setBrand(sc.nextLine());
            System.out.println("Brand Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update Model
    @Override
    @Transactional
    public void updateModel(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New Model: ");
            laptop.setModel(sc.nextLine());
            System.out.println("Model Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update IMIE No
    @Override
    @Transactional
    public void updateImieNo(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New IMIE No: ");
            laptop.setImie_no(sc.nextLong());
            System.out.println("IMIE No Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update RAM
    @Override
    @Transactional
    public void updateRam(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New RAM: ");
            laptop.setRam(sc.nextInt());
            System.out.println("RAM Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update Memory
    @Override
    @Transactional
    public void updateMemory(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New Memory: ");
            laptop.setMemory(sc.nextInt());
            System.out.println("Memory Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update Generation
    @Override
    @Transactional
    public void updateGeneration(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New Generation: ");
            laptop.setGeneration(sc.nextInt());
            System.out.println("Generation Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update Processor
    @Override
    @Transactional
    public void updateProcessor(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New Processor: ");
            laptop.setProcessor(sc.nextLine());
            System.out.println("Processor Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Update Price
    @Override
    @Transactional
    public void updatePrice(int theId) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            System.out.print("Enter New Price: ");
            laptop.setPrice(sc.nextDouble());
            System.out.println("Price Updated Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }

    // ✅ Delete Laptop
    @Override
    @Transactional
    public void remove(int theId) {
        Laptop laptop = theManager.find(Laptop.class, theId);
        if (laptop != null) {
            theManager.remove(laptop);
            System.out.println("Laptop Deleted Successfully!");
        } else {
            System.out.println("Laptop Not Found!");
        }
    }
}
