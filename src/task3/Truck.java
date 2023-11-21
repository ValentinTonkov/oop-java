package task3;

public class Truck extends AbstractVehicle{
    private double load;

    public Truck(String name, String color, int numberOfWheels, double load) {
        super(name, color, numberOfWheels);
        this.load = load;
    }



    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    /**
     * Implementation for truck
     */
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}
