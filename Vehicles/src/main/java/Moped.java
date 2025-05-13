public class Moped extends Vehicle {
    private String color;
    private double maxSpeed;
    private int mileage;

    public Moped(String color, int passengerNum, int cargoCapacity, int fuelCapacity, String color1, double maxSpeed, int mileage) {
        super(color, passengerNum, cargoCapacity, fuelCapacity);
        this.color = color1;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
