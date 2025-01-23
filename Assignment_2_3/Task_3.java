//Properly inherit classes:
//        • a car from a vehicle;
//• an electric car - from a car.
//Remove duplicate variables.
//        Requirements:
//        • The Car class must inherit from the Vehicle class.
//        • The ElectricCar class must inherit from the Car class.
//        • There should be no duplicate variables.

package Assignment_2_3;

public class Task_3 {
    public class ElectricCar extends Car {
        int electricEnginePower;
    }
    public class Vehicle {
        double maxSpeed;
    }
    public class Car extends Vehicle {
        int wheelCount;
        double weight;
    }
}
