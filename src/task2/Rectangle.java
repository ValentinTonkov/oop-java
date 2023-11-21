package task2;

public class Rectangle extends Figure{
    private final double a;
    private final double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return a * b;
    }
}
