// Inheritance and Polymorphism Lecture: mini-exercise

package Vehicles;

public class Vehicle {

    private String name;
    private String sound;

// SETTER/GETTER START
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
// SETTER/GETTER END

    public void makeNoise(){
        System.out.println("vroooooom vroom");
    }


}
