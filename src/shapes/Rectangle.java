
package shapes;

public class Rectangle {

    private int length;
    private int width;

// GETTER/SETTER START

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

// GETTER/SETTER END

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void getArea() {
        int area = length * width;
        System.out.println("The area of the rectangle with a width of " + width + " and a length of " + length + " is " + area);
    }
    public void getPerimeter() {
        int perimeter = (2 * length) + (2 * width);
        System.out.println("The perimeter of the rectangle with a width of " + width + " and a length of " + length + " is " + perimeter);
    }

}
