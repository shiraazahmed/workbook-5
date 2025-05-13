public class Car extends Vehicle {
    private double engineSize;
    private String fuelType;
    private int numberOfDoors;
    private String color;

    public Car(String color, int passengerNum, int cargoCapacity, int fuelCapacity, double engineSize, String fuelType, int numberOfDoors, String color1) {
        super(color, passengerNum, cargoCapacity, fuelCapacity);
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.color = color1;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
