// Inheritance and Polymorphism Lecture: mini-exercise


package Vehicles;

import Vehicles.*;

public class VehicleTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Car();
        garage.vehicles[1] = new Mustang();
        garage.vehicles[2] = new Kawasaki();
        garage.alarmCascade();
    }



}
