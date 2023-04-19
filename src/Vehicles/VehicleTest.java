// Inheritance and Polymorphism Lecture: mini-exercise


package Vehicles;

import Vehicles.*;

import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Car("Car","vroom");
        garage.vehicles[1] = new Mustang("Mustang","vroom");
        garage.vehicles[2] = new Kawasaki("Kawasaki","vroom");
        garage.alarmCascade();

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(garage.vehicles[0]);
        vehicleList.add(garage.vehicles[1]);
        vehicleList.add(garage.vehicles[2]);


        for (Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getName());
        }
    }

}
