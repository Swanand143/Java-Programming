package com.example.laptop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="laptop_id")
    private int id;

    @Column(name ="brand")
    private String brand;

    @Column(name ="model")
    private String model;

    @Column(name ="imie_no")
    private long imie_no;

    @Column(name ="ram")
    private int ram;

    @Column(name ="memory")
    private int memory;

    @Column(name ="generation")
    private int generation;

    @Column(name ="processor")
    private String processor;

    @Column(name ="price")
    private double price;

    public Laptop()
    {

    }

    public Laptop(String brand, String model, long imie_no, int ram, int memory, int generation, String processor, double price) {
        this.brand = brand;
        this.model = model;
        this.imie_no = imie_no;
        this.ram = ram;
        this.memory = memory;
        this.generation = generation;
        this.processor = processor;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getImie_no() {
        return imie_no;
    }

    public void setImie_no(long imie_no) {
        this.imie_no = imie_no;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                ", generation=" + generation +
                ", processor=" + processor +
                ", price=" + price +
                ", imie_no=" + imie_no +
                ", id=" + id +
                '}';
    }
}
