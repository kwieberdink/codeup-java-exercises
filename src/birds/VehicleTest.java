// Inheritance and Polymorphism Lecture: mini-exercise


package birds;

public class VehicleTest {

    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki();
        kawasaki.setName("Motorcycle");
        kawasaki.makeNoise();
        Mustang mustang = new Mustang();
        mustang.setName("Mustang");
        mustang.makeNoise();

    }

}
