package task3;

public class Car extends AbstractVehicle{
    private double horsePower;

    public Car(String name, String color, int numberOfWheels, double horsePower) {
        super(name, color, numberOfWheels);
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * Implementation for car
     */
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
