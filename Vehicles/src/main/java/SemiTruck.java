public class SemiTruck extends Vehicle {
    private int numberOfWheels;
    private int cargoCapacity;

    public SemiTruck(String color, int passengerNum, int cargoCapacity, int fuelCapacity, int numberOfWheels, int cargoCapacity1) {
        super(color, passengerNum, cargoCapacity, fuelCapacity);
        this.numberOfWheels = numberOfWheels;
        this.cargoCapacity = cargoCapacity1;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
