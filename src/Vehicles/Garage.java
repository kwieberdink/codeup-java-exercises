// Inheritance and Polymorphism Lecture: mini-exercise

package Vehicles;

import Vehicles.Vehicle;

public class Garage {

    Vehicle[] vehicles;

    public void alarmCascade() {
        for (Vehicle vehicle : this.vehicles) {
            vehicle.makeNoise();
        }
    }
}
