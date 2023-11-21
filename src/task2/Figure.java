package task2;

public abstract class Figure {
    private final String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return the area of the figure
     */
    public abstract double getArea();
}
