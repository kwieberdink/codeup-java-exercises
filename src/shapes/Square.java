package shapes;

public class Square extends Quadrilateral implements  Measurable {
    @Override
    public void setLength(double num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public void setWidth(double num) {
        this.length = num;
        this.width = num;
    }

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
//
//    private int side;
//
//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }
//
//    // Have to call super in order to have access to the parent's constructor
//    public Square() {
////        super(side, side);
//    }
//
//    public void getArea(int side) {
//        int perimeter = 4 * side;
//        System.out.println(perimeter);
//    }
//    public void getPerimeter(int side) {
//        int area = side * side;
//        System.out.println(area);
//    }

}
