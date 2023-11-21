package task2;

public class Cylinder extends Figure {
    private final double r;
    private final double h;

    public Cylinder(String name, double r, double h) {
        super(name);
        this.r = r;
        this.h = h;
    }

    /**
     * override method
     * @return the area of the cylinder
     */
    @Override
    public double getArea() {
        return 2 * Math.PI * r * (r + h);
    }
}
