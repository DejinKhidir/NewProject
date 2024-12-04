package com.dejin;

public class Lights extends Product {

    private double watt;
    private int lumen;

    public Lights (String id, String name, double price, int rating, double watt, int lumen) {
        super(id, name, price, rating);
        this.watt = watt;
        this.lumen = lumen;
    }

    public double getWatt() {
        return watt;
    }
    public void setWatt(double watt) {
        this.watt = watt;
    }
    public int getLumen() {
        return lumen;
    }
    public void setLumen(int lume) {
        this.lumen = lumen;
    }


    @Override
    public void displayDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Rating: " + getRating());
        System.out.println("Watt: " + getWatt());
        System.out.println("Lumen: " + getLumen());
    }









}
