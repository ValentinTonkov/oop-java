package task3;

public class Bus extends AbstractVehicle {
    private int numberOfPassengers;

    public Bus(String name, String color, int numberOfWheels, int numberOfPassengers) {
        super(name, color, numberOfWheels);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * implementation for bus
     */
    @Override
    public void drive() {
        System.out.println("Driving a bus");
    }
}
