public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.getColor();
        car.getNumberOfDoors();
        car.getEngineSize();
        car.getFuelType();

        Moped moped = new Moped();
        moped.getColor();
        moped.getMaxSpeed();
        moped.getMileage();

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.getNumberOfWheels();
        semiTruck.getCargoCapacity();

    }


}
