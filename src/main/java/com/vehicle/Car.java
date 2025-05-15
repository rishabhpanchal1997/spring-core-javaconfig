package com.vehicle;

import com.engine.Engine;

public class Car {
    private String company;
    private String model;
    private Engine engine;

    public Car() {
    }

    public Car(String company, String model, Engine engine) {
        this.company = company;
        this.model = model;
        this.engine = engine;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void carStart(){
        engine.start();
        System.out.println("Car started !");
    }
}

