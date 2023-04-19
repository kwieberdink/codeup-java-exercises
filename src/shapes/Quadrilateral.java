package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public abstract void setLength(double num);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double num);

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
