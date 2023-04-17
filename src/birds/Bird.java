// Inheritance and Polymorphism Lecture

package birds;

public class Bird {

    private String name;

// GETTER/SETTER START
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// GETTER/SETTER END

    public void makeNoise(){
        System.out.println(this.name + " says tweet tweet");
    }

    public void layEggs() {
        System.out.println("Laying an egg.");
    }

}
