package com.example.di;

public class Car {
    private Engine engine;

    // ✅ Default constructor (required for setter injection)
    public Car() {
        System.out.println("Car object created (default constructor)");
    }

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving...");
    }
}
