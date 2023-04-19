// Inheritance and Polymorphism Lecture: mini-exercise

package Vehicles;

public class Mustang extends Vehicle {
    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("sputter sputter kablunk");
    }

    public Mustang(String name, String sound) {
        super(name, sound);
    }

    public void makeNoise() {
        System.out.println("zooooooooooom");
    }

}
