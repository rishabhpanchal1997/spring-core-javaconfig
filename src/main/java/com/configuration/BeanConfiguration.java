package com.configuration;

import com.engine.DieselEngine;
import com.engine.Engine;
import com.engine.PetrolEngine;
import com.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Engine petrolEngine() {
        PetrolEngine engine = new PetrolEngine();
        engine.setFuel("Petrol");
        engine.setWeight(150);
        return engine;
    }

    @Bean
    public Engine dieselEngine() {
        return new DieselEngine("Diesel", 200);
    }

    @Bean(name = "myCarBean")
    public Car car() {
        return new Car("Toyota", "Fortuner", dieselEngine());  // Inject DieselEngine here
    }
}
