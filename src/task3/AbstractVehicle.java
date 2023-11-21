package task3;

public abstract class AbstractVehicle implements Vehicle{
    private String name;
    private String color;
    private int numberOfWheels;

    public AbstractVehicle(String name, String color, int numberOfWheels) {
        this.name = name;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
