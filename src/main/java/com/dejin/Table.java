package com.dejin;

public class Table extends Product {

    private double height;
    private double width;
    private double length;

    public Table(String id, String name, double price, int rating, double height, double width, double length) {
        super(id, name, price, rating);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Rating: " + getRating());
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
        System.out.println("Length: " + getLength());
    }







}
