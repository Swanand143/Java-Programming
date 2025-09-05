package com.example.laptop.dao;

import com.example.laptop.entity.Laptop;

import java.util.List;

public interface LaptopDAO {

    // Insert
    public void save(Laptop theLaptop);

    // Fetch methods
    public Laptop findById(int theId);

    public Laptop findByImieNo(long imieNo);

    public List<Laptop> findByBrand(String brand);

    public List<Laptop> findByModel(String model);

    public List<Laptop> findByProcessor(String processor);

    public List<Laptop> findByRam(int ram);

    public List<Laptop> findByMemory(int memory);

    public List<Laptop> findByGeneration(int generation);

    public List<Laptop> findByPrice(double price);

    public List<Laptop> fetchAll();

    // Update methods
    public void updateBrand(int theId);

    public void updateModel(int theId);

    public void updateImieNo(int theId);

    public void updateRam(int theId);

    public void updateMemory(int theId);

    public void updateGeneration(int theId);

    public void updateProcessor(int theId);

    public void updatePrice(int theId);

    // Delete
    public void remove(int theId);
}
