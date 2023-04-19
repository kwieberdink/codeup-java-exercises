// Inheritance and Polymorphism Lecture: mini-exercise

package Vehicles;

public class Kawasaki extends Vehicle {
    public Kawasaki(String name, String sound) {
        super(name, sound);
    }

    public void makeNoise() {
        System.out.println("skrt skrt");
    }
}
