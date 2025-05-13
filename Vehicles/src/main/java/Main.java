public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red", 5, 500, 50, 2.0, "Petrol", 4, "Red");
        car.setColor("Red");
        car.setEngineSize(2.0);
        car.setFuelType("Petrol");
        car.setNumberOfDoors(4);

        Moped moped = new Moped("Blue", 2, 0, 5, "Blue", 60.0, 100);
        moped.setColor("Blue");
        moped.setMaxSpeed(60.0);
        moped.setMileage(100);

        SemiTruck truck = new SemiTruck("Green", 2, 20000, 300, 18, 20000);
        truck.setNumberOfWheels(18);
        truck.setCargoCapacity(20000);

        System.out.println("Car color: " + car.getColor());
        System.out.println("Car engine size: " + car.getEngineSize());
        System.out.println("Car fuel type: " + car.getFuelType());
        System.out.println("Car number of doors: " + car.getNumberOfDoors());
        System.out.println("Moped color: " + moped.getColor());
        System.out.println("Moped max speed: " + moped.getMaxSpeed());
        System.out.println("Moped mileage: " + moped.getMileage());
        System.out.println("Truck number of wheels: " + truck.getNumberOfWheels());
        System.out.println("Truck cargo capacity: " + truck.getCargoCapacity());




    }


}
