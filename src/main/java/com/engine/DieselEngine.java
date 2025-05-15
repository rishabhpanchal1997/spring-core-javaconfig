package com.engine;

public class DieselEngine implements Engine{
    private String fuel;
    private int weight;

    //Setter Injection → Requires default constructor
    //Constructor Injection → Does not require default constructor
    public DieselEngine(String fuel, int weight) {
        this.fuel = fuel;
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Diesel Engine started with fuel: " + fuel + ", weight: " + weight + "kg.");
    }
}
