package com.engine;

public class PetrolEngine implements Engine{
    private String fuel;
    private int weight;

    //Setter Injection → Requires default constructor
    //Constructor Injection → Does not require default constructor
    public PetrolEngine() {
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Petrol Engine started with fuel: " + fuel + ", weight: " + weight + "kg.");
    }
}
