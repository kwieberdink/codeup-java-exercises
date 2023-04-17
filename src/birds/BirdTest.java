// Inheritance and Polymorphism Lecture

package birds;

public class BirdTest {

    public static void main(String[] args) {
        Quaker quaker = new Quaker();
        // When given no constructor, you can use this method
        quaker.setName("Quaker");
        quaker.makeNoise();
        Finch finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();
    }

}
