package edu.sda.grcy.patterns2.structural.flyweight;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
    private String producer;
    private String VIN;
    private String version;
    private String modelName;
    private Engine engine;

    public Car(String producer, String VIN, String version, String modelName, Engine engine) {
        this.producer = producer;
        this.VIN = VIN;
        this.version = version;
        this.modelName = modelName;
        this.engine = engine;
    }
}
