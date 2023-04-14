package shapes;
import util.*;
public class CircleApp {

    public static void main(String[] args) {
        double radius = new Input().getDouble("Please enter the radius of the circle:");
        Circle circle = new Circle(radius);
        System.out.println("The area of your circle is: " + circle.getArea());


    }

}
