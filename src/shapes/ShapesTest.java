package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;
        myShape = new Rectangle(10, 15);
        System.out.println("Rectangle Area => " + myShape.getArea());
        System.out.println("Rectangle Perimeter => " + myShape.getPerimeter());

        myShape = new Square(10,10);
        System.out.println("Square Area => " + myShape.getArea());
        System.out.println("Square Perimeter => " + myShape.getPerimeter());
//        Rectangle box1 = new Rectangle(4,5);
//        box1.getArea();
//        box1.getPerimeter();
//        Square box2 = new Square();
//        box2.getArea(5);
//        box2.getPerimeter(5);

    }

}
