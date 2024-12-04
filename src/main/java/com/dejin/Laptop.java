package com.dejin;

public class Laptop extends Product {

    private double screenSize;
    private int ram;
    private int SSD;
    private String Processor;


    public Laptop(String id, String name, double price, int rating, double screenSize, int ram, int SSD, String Processor){
        super(id, name, price, rating);
        this. screenSize = screenSize;
        this. ram = ram;
        this. SSD = SSD;
        this. Processor = Processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }


    @Override
    public void displayDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Rating: " + getRating());
        System.out.println("Screen Size: " + screenSize);
        System.out.println("RAM: " + ram);
        System.out.println("SSD: " + SSD);
        System.out.println("Processor: " + Processor);
    }

















}
